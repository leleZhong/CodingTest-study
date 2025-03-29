import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            Queue<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new int[]{i, priority});
            }

            int cnt = 1;
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                int idx = curr[0];
                int prio = curr[1];

                boolean higher = false;
                for (int[] arr : queue) {
                    if (arr[1] > prio) {
                        queue.offer(curr);
                        higher = true;
                        break;
                    }
                }
                
                if (higher)
                    continue;
                else {
                    if (idx == M)
                        break;
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}