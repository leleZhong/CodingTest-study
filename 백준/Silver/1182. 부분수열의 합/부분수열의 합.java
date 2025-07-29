import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, S;
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        recur(0, 0, 0);

        System.out.print(cnt);
    }

    static void recur(int idx, int sum, int size) {
        if (idx == N) {
            if (sum == S && size > 0) {
                cnt++;
            }
            return;
        }

        recur(idx + 1, sum, size);
        recur(idx + 1, sum + arr[idx], size + 1);
    }
}