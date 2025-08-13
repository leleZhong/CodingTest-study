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

        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        boolean[][] visited = new boolean[N][M];
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[] { 0, 0 });
        visited[0][0] = true;

        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, 1, -1 };

        int cnt = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            cnt++;

            while (size-- > 0) {
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];

                if (x == N - 1 && y == M - 1) {
                    System.out.print(cnt);
                    return;
                }

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                        continue;
                    }

                    if (!visited[nx][ny] && arr[nx][ny] == '1') {
                        visited[nx][ny] = true;
                        q.add(new int[] { nx, ny });
                    }
                }
            }
        }
    }
}