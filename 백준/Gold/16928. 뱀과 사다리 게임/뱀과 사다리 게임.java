import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] board = new int[101];
        for (int i = 1; i < 101; i++) {
            board[i] = i;
        }

        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            board[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }

        ArrayDeque<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[101];
        q.add(1);
        visited[1] = true;

        int cnt = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size --> 0) {
                int cur = q.poll();
                if (cur == 100) {
                    System.out.print(cnt);
                    return;
                }

                for (int i = 1; i <= 6; i++) {
                    int nx = cur + i;
                    if (nx <= 100 && !visited[nx]) {
                        visited[nx] = true;
                        q.add(board[nx]);
                    }
                }
            }
            cnt++;
        }
    }
}