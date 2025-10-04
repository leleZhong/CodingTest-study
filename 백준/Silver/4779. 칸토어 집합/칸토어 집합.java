import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s;
        String[] dp = new String[13];
        dp[0] = "-";
        for (int i = 1; i <= 12; i++) {
            StringBuilder sb = new StringBuilder();
            int spaceSize = (int) Math.pow(3, i - 1);

            sb.append(dp[i - 1]);
            for (int j = 0; j < spaceSize; j++) {
                sb.append(" ");
            }
            sb.append(dp[i - 1]);

            dp[i] = sb.toString();
        }

        while ((s = br.readLine()) != null) {
            int N = Integer.parseInt(s);
            System.out.println(dp[N]);
        }
    }
}