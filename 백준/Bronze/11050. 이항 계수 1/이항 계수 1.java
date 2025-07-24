import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new int[N + 1][K + 1];
        System.out.print(recur(N, K));
    }

    static int recur(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        if (dp[n][k] != 0) {
            return dp[n][k];
        }

        return dp[n][k] = recur(n - 1, k - 1) + recur(n - 1, k);
    }
}