import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(N);
        boolean[] visited = new boolean[N + 1];
        visited[N] = true;
        int depth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int cur = q.poll();
                if (cur == 1) {
                    System.out.print(depth);
                    return;
                }

                if (cur % 3 == 0 && !visited[cur / 3]) {
                    visited[cur / 3] = true;
                    q.add(cur / 3);
                }
                if (cur % 2 == 0 && !visited[cur / 2]) {
                    visited[cur / 2] = true;
                    q.add(cur / 2);
                }
                if (!visited[cur - 1]) {
                    visited[cur - 1] = true;
                    q.add(cur - 1);
                }
            }
            depth++;
        }
    }
}