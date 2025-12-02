import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int M = Integer.parseInt(br.readLine());
            sb.append((M + 1) / 2).append("\n");

            PriorityQueue<Integer> maxQ = new PriorityQueue<>();
            PriorityQueue<Integer> minQ = new PriorityQueue<>(Collections.reverseOrder());
            
            int cnt = 1;
            int ten = 0;
            for (int i = 0; i < M / 10 + 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    if (maxQ.size() == minQ.size()) {
                        maxQ.add(Integer.parseInt(st.nextToken()));
                    } else {
                        minQ.add(Integer.parseInt(st.nextToken()));
                    }

                    if (!minQ.isEmpty() && minQ.peek() > maxQ.peek()) {
                        int tmp = maxQ.poll();
                        maxQ.add(minQ.poll());
                        minQ.add(tmp);
                    }

                    if (cnt % 2 == 1) {
                        sb.append(maxQ.peek()).append(" ");
                        ten++;
                        if (ten % 10 == 0) {
                            sb.append("\n");
                        }
                    }

                    cnt++;
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}