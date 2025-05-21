import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    static int N;
    static boolean[][] board;
    static int cnt;
    static int[] dx = {-1, 1, -1, 1};
    static int[] dy = {-1, -1, 1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            N = Integer.parseInt(br.readLine());
            board = new boolean[N][N];

            cnt = 0;
            dfs(0);

            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }

    static void dfs(int row) {
        if (row == N) {
            cnt++;
            return;
        }
        
        for (int col = 0; col < N; col++) {
            if (isPossible(row, col)) {
                board[row][col] = true;
                dfs(row + 1);
                board[row][col] = false;
            }
        }
    }

    static boolean isPossible(int r, int c) {
        for (int i = 0; i < r; i++) {
            if (board[i][c])
                return false;
        }

        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j])
                return false;
        }

        for (int i = r - 1, j = c + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j])
                return false;
        }

        return true;
    }
}
