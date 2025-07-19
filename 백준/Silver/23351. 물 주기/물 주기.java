import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        byte N = Byte.parseByte(st.nextToken());
        byte K = Byte.parseByte(st.nextToken());
        byte A = Byte.parseByte(st.nextToken());
        byte B = Byte.parseByte(st.nextToken());

        N /= A;
        byte[] arr = new byte[N];
        Arrays.fill(arr, K);

        int idx = 0;
        int ans = 1;
        while (true) {
            arr[idx] += B;
            idx = (idx + 1) % N;

            for (int i = 0; i < N; i++) {
                if (--arr[i] == 0) {
                    System.out.print(ans);
                    return;
                }
            }

            ans++;
        }
    }
}