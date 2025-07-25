import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static int[][] arr;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        dp = new int[N][K + 1];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.print(recur(0, 0));
    }

    static int recur(int idx, int w) {
        if (w > K) {
            return -1000000;
        }

        if (idx == N) {
            return 0;
        }

        if (dp[idx][w] != -1) {
            return dp[idx][w];
        }

        int a =  recur(idx + 1, w + arr[idx][0]) + arr[idx][1];
        int b = recur(idx + 1, w);

        return dp[idx][w] = Math.max(a, b);
    }
}