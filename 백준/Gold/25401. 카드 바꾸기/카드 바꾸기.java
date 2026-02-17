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

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if ((arr[j] - arr[i]) % (j - i) != 0) continue;
                int d = (arr[j] - arr[i]) / (j - i);

                int cnt = 0;
                for (int k = 0; k < N; k++) {
                    if (arr[k] != arr[i] + (k - i) * d) {
                        cnt++;
                    }
                }
                min = Math.min(min, cnt);
            }
        }
        System.out.println(min);
    }
}