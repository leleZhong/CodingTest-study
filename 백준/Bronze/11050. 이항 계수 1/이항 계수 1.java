import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int K;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[K];
        recur(0, N);
    }

    static void recur(int depth, int start) {
        if (depth == K) {
            int ans = 1;
            for (int i = 0; i < K; i++) {
                ans *= arr[i];
            }
            
            for (int i = K; i > 0; i--) {
                ans /= i;
            }

            System.out.print(ans);
            return;
        }

        arr[depth] = start;
        recur(depth + 1, start - 1);
    }
}