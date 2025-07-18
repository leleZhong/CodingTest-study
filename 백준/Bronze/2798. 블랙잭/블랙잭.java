import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int two = arr[i] + arr[j];
                if (two >= M) break;

                int l = j + 1;
                int r = N - 1;
                while (l <= r) {
                    int m = (l + r) / 2;
                    int sum = two + arr[m];
                    if (sum <= M) {
                        max = Math.max(max, sum);
                        l = m + 1;
                    } else {
                        r = m - 1;
                    }
                }
            }
        }

        System.out.print(max);
    }
}