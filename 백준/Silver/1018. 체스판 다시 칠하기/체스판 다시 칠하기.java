import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int cntW = 0, cntB = 0;
                for (int r = 0; r < 8; r++) {
                    for (int c = 0; c < 8; c++) {
                        // 흰색으로 시작
                        if ((r + c) % 2 == 0) {
                            if (board[i + r][j + c] != 'W') cntW++;
                        } else {
                            if (board[i + r][j + c] != 'B') cntW++;
                        }

                        // 검은색으로 시작
                        if ((r + c) % 2 == 0) {
                            if (board[i + r][j + c] != 'B') cntB++;
                        } else {
                            if (board[i + r][j + c] != 'W') cntB++;
                        }
                    }
                }
                min = Math.min(min, Math.min(cntW, cntB));
            }
        }
        System.out.print(min);
    }
}