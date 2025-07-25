import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        dp = new int[N + 1];

        for (int i = N - 1; i >= 0; i--) {
            int nextT = i + arr[i][0]; // 상담이 끝나는 날
            if (nextT > N) {
                dp[i] = dp[i + 1];
            } else {
                dp[i] = Math.max(arr[i][1] + dp[nextT], dp[i + 1]);
            }
        }

        System.out.print(dp[0]);
    }
}