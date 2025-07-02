import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] board = new char[10][10];
        for (int i = 0; i < 10; i++) {
            board[i] = br.readLine().toCharArray();
        }

        boolean possible = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == '.') {
                    if (find(board, i, j)) {
                        possible = true;
                        break;
                    }
                }
            }
            if (possible)
                break;
        }
        System.out.print(possible ? 1 : 0);
    }

    static boolean find(char[][] arr, int x, int y) {
        int[] dx = { 0, 1, 1, 1 };
        int[] dy = { 1, 0, 1, -1 };
        for (int d = 0; d < 4; d++) {
            int cnt = 1;
            for (int i = 1; i < 5; i++) {
                int nx = x + dx[d] * i;
                int ny = y + dy[d] * i;
                if (!isValid(nx, ny))
                    break;

                if (arr[nx][ny] == 'X')
                    cnt++;
                else
                    break;
            }
            for (int i = 1; i < 5; i++) {
                int nx = x - dx[d] * i;
                int ny = y - dy[d] * i;
                if (!isValid(nx, ny))
                    break;

                if (arr[nx][ny] == 'X')
                    cnt++;
                else
                    break;
            }
            if (cnt >= 5)
                return true;

        }

        return false;
    }

    static boolean isValid(int x, int y) {
        if (x < 0 || x > 9 || y < 0 || y > 9)
            return false;
        return true;
    }
}