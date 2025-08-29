import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, T;
    static int[][] arr;
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        arr = new int[N][2];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

            sum += arr[i][1];
        }

        dp = new int[N][T + 1];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
        }

        int max = recur(0, 0);
        System.out.print(sum - max);
    }

    static int recur(int idx, int day) {
        if (day > T) {
            return -100000;
        }

        if (idx == N) {
            return 0;
        }

        if (dp[idx][day] != -1) {
            return dp[idx][day];
        }

        int a = recur(idx + 1, day + arr[idx][0]) + arr[idx][1];
        int b = recur(idx + 1, day);

        return dp[idx][day] = Math.max(a, b);
    }
}