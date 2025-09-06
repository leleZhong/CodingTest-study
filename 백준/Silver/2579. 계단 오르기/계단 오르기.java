import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.print(arr[1]);
            return;
        }

        int[][] dp = new int[N + 1][3];
        dp[1][1] = arr[1];
        dp[2][1] = arr[2];
        dp[2][2] = arr[1] + arr[2];

        for (int i = 3; i <= N; i++) {
            dp[i][1] = Math.max(dp[i - 2][1], dp[i - 2][2]) + arr[i];
            dp[i][2] = dp[i - 1][1] + arr[i];
        }

        System.out.print(Math.max(dp[N][1], dp[N][2]));
    }
}