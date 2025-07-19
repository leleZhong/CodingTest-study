import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        int ans = 1;
        while (true) {
            if (ans % N == 0) {
                K += B;
            }
            if (--K == 0) {
                System.out.print(ans);
                return;
            }
            ans++;
        }
    }
}