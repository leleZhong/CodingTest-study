import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N;
    static int[] arr;
    static long[][][][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        dp = new long[N + 2][3][3][2];
        for (int i = 0; i <= N + 1; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                    Arrays.fill(dp[i][j][k], -1);
                }
            }
        }
        
        System.out.print(recur(2, 0, 0, 0));
    }

    static long recur(int depth, int continuous, int prev, int two) {
        if (depth == N + 1) {
            return two == 1 ? 1 : 0;
        }

        if (dp[depth][continuous][prev][two] != -1) {
            return dp[depth][continuous][prev][two];
        }

        long cnt = 0;
        cnt += recur(depth + 1, 0, 0, two);
        if (continuous < 2) {
            cnt += recur(depth + 1, continuous + 1, 1, two);
            if (prev != 2) {
                cnt += recur(depth + 1, continuous + 1, 2, 1);
            }
        }

        return dp[depth][continuous][prev][two] = cnt % 1000000007;
    }
}