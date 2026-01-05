import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        final int mod = 1000000007;

        // 2^i 전처리
        int[] pow2 = new int[N + 1];
        pow2[0] = 1;
        for (int i = 1; i <= N; i++) {
            pow2[i] = (pow2[i - 1] * 2) % mod;
        }

        int[] prefix = new int[N + 1];
        int[] suffix = new int[N + 2];
        for (int i = 1; i <= N; i++) {
            prefix[i] = prefix[i - 1] + (arr[i - 1] == 'W' ? 1 : 0);
        }
        for (int i = N; i >= 1; i--) {
            suffix[i] = suffix[i + 1] + (arr[i - 1] == 'E' ? 1 : 0);
        }

        long ans = 0;
        for (int i = 1; i <= N; i++) {
            if (arr[i - 1] == 'H') {
                long eCases = (pow2[suffix[i]] - suffix[i] - 1 + mod) % mod;
                ans = (ans + prefix[i] * eCases) % mod;
            }
        }

        System.out.println(ans);
    }
}