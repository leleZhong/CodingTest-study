import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int[][] box = new int[N][M];
        Queue<int[]> q = new ArrayDeque<>();
        int unripe = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1)
                    q.add(new int[] { i, j, 0 });
                else if (box[i][j] == 0)
                    unripe++;
            }
        }

        if (unripe == 0) {
            System.out.print(0);
            return;
        }

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        int ans = 0;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            int day = curr[2];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isValid(nx, ny) && box[nx][ny] == 0) {
                    q.add(new int[] { nx, ny, day + 1 });
                    box[nx][ny] = 1;
                    ans = Math.max(ans, day + 1);
                    unripe--;
                }
            }
        }

        System.out.print(unripe == 0 ? ans : -1);
    }

    static boolean isValid(int x, int y) {
        return !(x < 0 || x >= N || y < 0 || y >= M);
    }
}