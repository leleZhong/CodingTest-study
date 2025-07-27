import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[][] dp = new int[15][15];
        for (int i = 0; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                    continue;
                }

                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        while (T --> 0) {
            sb.append(dp[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())]).append("\n");
        }

        System.out.print(sb);
    }
}