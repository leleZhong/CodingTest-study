import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static PriorityQueue<Long> maxq = new PriorityQueue<>();
    static PriorityQueue<Long> minq = new PriorityQueue<>();
    static PriorityQueue<Long> lazy_min = new PriorityQueue<>();
    static PriorityQueue<Long> lazy_max = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long T = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            maxq.clear();
            minq.clear();
            lazy_max.clear();
            lazy_min.clear();

            Long n = Long.parseLong(br.readLine());
            while (n --> 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                if (st.nextToken().equals("I")) {
                    Long num = Long.parseLong(st.nextToken());
                    maxq.add(-num);
                    minq.add(num);
                } else {
                    lazyUpdate();

                    if (maxq.isEmpty()) continue;

                    if (Long.parseLong(st.nextToken()) == 1) {
                        lazy_min.add(-maxq.poll());
                    } else {
                        lazy_max.add(-minq.poll());
                    }
                }
            }

            lazyUpdate();
            sb.append(maxq.isEmpty() ? "EMPTY" : -maxq.poll() + " " + minq.poll()).append("\n");
        }

        System.out.print(sb);
    }

    static void lazyUpdate() {
        while (!lazy_max.isEmpty() && maxq.peek().equals(lazy_max.peek())) {
            maxq.poll();
            lazy_max.poll();
        }

        while (!lazy_min.isEmpty() && minq.peek().equals(lazy_min.peek())) {
            minq.poll();
            lazy_min.poll();
        }
    }
}