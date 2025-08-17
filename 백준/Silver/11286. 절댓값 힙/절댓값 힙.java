import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return Integer.compare(o1, o2);
                }
                return Math.abs(o1) - Math.abs(o2);
            }
        });

        int command;
        StringBuilder sb = new StringBuilder();
        while (N --> 0) {
            command = Integer.parseInt(br.readLine());
            if (command == 0) {
                sb.append(pq.size() == 0 ? 0 : pq.poll()).append("\n");
            } else {
                pq.add(command);
            }
        }

        System.out.print(sb);
    }
}