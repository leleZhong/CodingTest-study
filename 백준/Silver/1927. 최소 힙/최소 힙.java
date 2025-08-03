import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        while (N --> 0) {
            int x = Integer.parseInt(br.readLine());
            if (x > 0) {
                pq.add(x);
            } else {
                sb.append(pq.isEmpty() ? 0 : pq.poll()).append("\n");
            }
        }

        System.out.print(sb);
    }
}