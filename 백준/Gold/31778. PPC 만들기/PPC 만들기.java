import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] arr = br.readLine().toCharArray();

        int left = 0, right = N - 1;
        int swaps = 0;
        while (left < right && swaps < K) {
            if (arr[left] != 'C') {
                left++;
                continue;
            }
            if (arr[right] != 'P') {
                right--;
                continue;
            }
            arr[left] = 'P';
            arr[right] = 'C';
            left++;
            right--;
            swaps++;
        }

        int[] prefix = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            prefix[i] = prefix[i - 1] + (arr[i - 1] == 'P' ? 1 : 0);
        }

        long ans = 0;
        for (int i = 1; i <= N; i++) {
            if (arr[i - 1] == 'C') {
                ans += (long) prefix[i] * (prefix[i] - 1) / 2;
            }
        }

        System.out.println(ans);
    }
}