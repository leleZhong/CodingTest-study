import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[][] unsafe;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        unsafe = new int[N][N];

        recur(0);

        System.out.print(cnt);
    }

    static void recur(int depth) {
        if (depth == N) {
            cnt++;
            return;
        }

        // 현재 행에서 가능한 모든 열을 시도
        for (int j = 0; j < N; j++) {
            if (unsafe[depth][j] == 0) { // depth번째 행, j번째 열이 안전한지 확인
                attack(depth, j);
                recur(depth + 1);
                prevAttack(depth, j);
            }
        }
    }

    static void attack(int x, int y) {
        // 상하좌우
        for (int i = 0; i < N; i++) {
            unsafe[i][y]++;
            unsafe[x][i]++;
        }

        // 대각선
        for (int i = 0; i < N; i++) {
            int dx1 = x + i, dy1 = y + i;
            int dx2 = x - i, dy2 = y - i;
            if (isValid(dx1, dy1))
                unsafe[dx1][dy1]++;
            if (isValid(dx2, dy2))
                unsafe[dx2][dy2]++;
            if (isValid(dx1, dy2))
                unsafe[dx1][dy2]++;
            if (isValid(dx2, dy1))
                unsafe[dx2][dy1]++;
        }
    }

    static void prevAttack(int x, int y) {
        // 상하좌우
        for (int i = 0; i < N; i++) {
            unsafe[i][y]--;
            unsafe[x][i]--;
        }

        // 대각선
        for (int i = 0; i < N; i++) {
            int dx1 = x + i, dy1 = y + i;
            int dx2 = x - i, dy2 = y - i;
            if (isValid(dx1, dy1))
                unsafe[dx1][dy1]--;
            if (isValid(dx2, dy2))
                unsafe[dx2][dy2]--;
            if (isValid(dx1, dy2))
                unsafe[dx1][dy2]--;
            if (isValid(dx2, dy1))
                unsafe[dx2][dy1]--;
        }
    }

    static boolean isValid(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) {
            return true;
        }
        return false;
    }
}