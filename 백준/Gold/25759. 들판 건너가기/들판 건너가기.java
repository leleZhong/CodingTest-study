import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // dp[v] = 마지막으로 고른 꽃의 값이 v일 때 최대 아름다움
        long[] dp = new long[101];
        for (int i = 0; i <= 100; i++) {
            dp[i] = -1;
        }

        long max = 0;

        for (int i = 0; i < N; i++) {
            int cur = arr[i];
            long best = 0; // 현재 꽃만 고르는 경우

            // 이전에 고른 꽃의 값 확인
            for (int v = 1; v <= 100; v++) {
                if (dp[v] != -1) {
                    long diff = cur - v;
                    best = Math.max(best, dp[v] + diff * diff);
                }
            }

            dp[cur] = Math.max(dp[cur], best);
            max = Math.max(max, best);
        }

        System.out.println(max);
    }
}