import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        long[] dp = new long[101];
        Arrays.fill(dp, -1);

        dp[1] = dp[2] = dp[3] = 1;
        dp[4] = dp[5] = 2;
        dp[6] = 3;

        for (int i = 7; i <= 100; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            sb.append(dp[N]).append("\n");
        }

        System.out.print(sb);
    }
}