import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] snail;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        snail = new int[N][N];

        makeSnail();
        findPos(num);

        System.out.print(sb);
    }

    static void makeSnail() {
        int x = 0, y = 0, dir = 0;
        for (int i = N * N; i >= 1; i--) {
            snail[x][y] = i;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || nx >= N || ny < 0 || ny >= N || snail[nx][ny] != 0) {
                dir = ++dir % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(snail[i][j]);
                if (j < N - 1)
                    sb.append(" ");
            }
            sb.append("\n");
        }
    }

    static void findPos(int n) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (snail[i][j] == n) {
                    sb.append(i + 1).append(" ").append(j + 1);
                    return;
                }
            }
        }
    }
}