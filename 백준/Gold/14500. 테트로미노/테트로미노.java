import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][][][] block = {
            // 바
            { { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 } }, { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 3, 0 } } },
            // 정사각형
            { { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } } },
            // ㄴ 
            { { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 2, 1 } }, { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 } },
                    { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 2, 1 } }, { { 0, 2 }, { 1, 0 }, { 1, 1 }, { 1, 2 } },
                    { { 0, 1 }, { 1, 1 }, { 2, 0 }, { 2, 1 } }, { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 2 } },
                    { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 2, 0 } }, { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 1, 2 } } },
            // ㄹ
            { { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 2, 1 } }, { { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 } },
                    { { 0, 1 }, { 1, 0 }, { 1, 1 }, { 2, 0 } }, { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 1, 2 } } },
            // ㅜ
            { { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 1 } }, { { 0, 1 }, { 1, 0 }, { 1, 1 }, { 2, 1 } },
                    { { 0, 1 }, { 1, 0 }, { 1, 1 }, { 1, 2 } }, { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 2, 0 } } }
    };

    static int N, M;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < block[k].length; l++) {
                        max = Math.max(max, sum(i, j, k, l));
                    }
                }
            }
        }

        System.out.print(max);
    }

    static int sum(int x, int y, int shape, int location) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + block[shape][location][i][0];
            int ny = y + block[shape][location][i][1];
            if (check(nx, ny)) {
                cnt += arr[nx][ny];
            } else {
                return 0;
            }
        }
        return cnt;
    }

    static boolean check(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < M) {
            return true;
        }
        return false;
    }
}