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
                    q.add(new int[] { i, j });
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
        int days = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int x = curr[0];
                int y = curr[1];

                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (isValid(nx, ny) && box[nx][ny] == 0) {
                        q.add(new int[] { nx, ny });
                        box[nx][ny] = box[x][y] + 1; // 토마토가 익은 날 직접 저장
                        unripe--;
                    }
                }
            }
            days++;
        }
        System.out.print(unripe == 0 ? days - 1 : -1); // 마지막날에 토마토를 익힌 후에도 days++를 하므로 보정해줌 
    }

    static boolean isValid(int x, int y) {
        return !(x < 0 || x >= N || y < 0 || y >= M);
    }
}