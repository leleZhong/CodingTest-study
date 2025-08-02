import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N >= K) {
            System.out.print(N - K);
            return;
        }

        boolean[] visited = new boolean[100001];
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(N);
        visited[N] = true;
        int time = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int cur = q.poll();

                if (cur == K) {
                    System.out.print(time);
                    return;
                }

                int[] next = { cur - 1, cur + 1, cur * 2 };

                for (int nextPos : next) {
                    if (nextPos >= 0 && nextPos <= 100000 && !visited[nextPos]) {
                        visited[nextPos] = true;
                        q.offer(nextPos);
                    }
                }
            }
            time++;
        }
    }
}