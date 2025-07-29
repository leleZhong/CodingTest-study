import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int cnt = 0;
    static boolean[] col, diag1, diag2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        col = new boolean[N];
        diag1 = new boolean[N * 2 - 1];
        diag2 = new boolean[N * 2 - 1];

        recur(0);

        System.out.print(cnt);
    }

    static void recur(int depth) {
        if (depth == N) {
            cnt++;
            return;
        }

        for (int c = 0; c < N; c++) {
            if (!col[c] && !diag1[depth + c] && !diag2[depth - c + (N - 1)]) {
                col[c] = diag1[depth + c] = diag2[depth - c + (N - 1)] = true;
                recur(depth + 1);
                col[c] = diag1[depth + c] = diag2[depth - c + (N - 1)] = false;
            }
        }
    }
}