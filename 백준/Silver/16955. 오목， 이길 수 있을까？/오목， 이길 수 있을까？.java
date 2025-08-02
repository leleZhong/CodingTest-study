import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[][] arr = new char[10][10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] == '.') {
                    arr[i][j] = 'X';
                    if (row(i, j) || col(i, j) || cross(i, j)) {
                        System.out.print(1);
                        return;
                    }
                    arr[i][j] = '.';
                }
            }
        }

        System.out.print(0);
    }

    static boolean row(int x, int y) {
        int cnt = 0;
        for (int i = -4; i <= 4; i++) {
            int ny = y + i;
            if (isValid(x, ny)) {
                if (arr[x][ny] == 'X') {
                    cnt++;
                } else {
                    cnt = 0;
                }
            }
            if (cnt >= 5) {
                return true;
            }
        }
        return false;
    }

    static boolean col(int x, int y) {
        int cnt = 0;
        for (int i = -4; i <= 4; i++) {
            int nx = x + i;
            if (isValid(nx, y)) {
                if (arr[nx][y] == 'X') {
                    cnt++;
                } else {
                    cnt = 0;
                }
            }
            if (cnt >= 5) {
                return true;
            }
        }
        return false;
    }

    static boolean cross(int x, int y) {
        int cnt1 = 0, cnt2 = 0;
        for (int i = -4; i <= 4; i++) {
            int nx = x + i;
            int ny = y - i;
            if (isValid(nx, ny)) {
                if (arr[nx][ny] == 'X') {
                    cnt1++;
                } else {
                    cnt1 = 0;
                }
            }
            if (cnt1 >= 5) {
                return true;
            }
        }

        for (int i = -4; i <= 4; i++) {
            int nx = x + i;
            int ny = y + i;
            if (isValid(nx, ny)) {
                if (arr[nx][ny] == 'X') {
                    cnt2++;
                } else {
                    cnt2 = 0;
                }
            }
            if (cnt2 >= 5) {
                return true;
            }
        }
        return false;
    }

    static boolean isValid(int x, int y) {
        if (x >= 0 && x < 10 && y >= 0 && y < 10) {
            return true;
        }
        return false;
    }
}