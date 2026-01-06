import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int[][] prefix = new int[N + 1][M + 1];
        int[][] suffix = new int[N + 2][M + 2];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                prefix[i][j] = (arr[i - 1][j - 1] == 'E' ? 1 : 0) + prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1];
            }
        }
        for (int i = N; i >= 1; i--) {
            for (int j = M; j >= 1; j--) {
                suffix[i][j] = (arr[i - 1][j - 1] == 'M' ? 1 : 0) + suffix[i + 1][j] + suffix[i][j + 1] - suffix[i + 1][j + 1];
            }
        }

        final int MOD = 1000000000 + 7;
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (arr[i - 1][j - 1] == 'S') {
                    ans += (long) prefix[i][j] * suffix[i][j] % MOD;
                    ans %= MOD;
                }
            }
        }

        System.out.println(ans);
    }
}