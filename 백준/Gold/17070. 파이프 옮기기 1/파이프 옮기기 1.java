import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int[][] home;

    static int[] dr = { 0, 1, 1 };
    static int[] dc = { 1, 0, 1 };
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        home = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                home[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        move(0, 1, 0); // 파이프의 오른쪽 끝 좌표, shape 0 : 가로, 1 : 세로, 2 : 대각선

        System.out.println(cnt);
    }

    static void move(int r, int c, int shape) {
        if (r == N - 1 && c == N - 1) {
            cnt++;
            return;
        }

        switch (shape) {
            case 0:
                if (valid(r, c + 1)) {
                    move(r, c + 1, shape);
                    if (valid(r + 1, c) && valid(r + 1, c + 1)) {
                        move(r + 1, c + 1, 2);
                    }
                }
                break;
            case 1:
                if (valid(r + 1, c)) {
                    move(r + 1, c, shape);
                    if (valid(r, c + 1) && valid(r + 1, c + 1)) {
                        move(r + 1, c + 1, 2);
                    }
                }
                break;
            default:
                if (valid(r, c + 1)) {
                    move(r, c + 1, 0);
                }
                if (valid(r + 1, c)) {
                    move(r + 1, c, 1);
                }
                if (valid(r, c + 1) && valid(r + 1, c) && valid(r + 1, c + 1)) {
                    move(r + 1, c + 1, shape);
                }
                break;
        }
    }

    static boolean valid(int r, int c) {
        if (r >= N || c >= N || home[r][c] == 1) return false;
        return true;
    }
}