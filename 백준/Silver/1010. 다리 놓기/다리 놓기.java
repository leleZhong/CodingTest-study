import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            BigInteger ans = BigInteger.ONE;
            for (int i = 0; i < N; i++) {
                ans = ans.multiply(BigInteger.valueOf(M--));
            }

            for (int i = N; i > 0; i--) {
                ans = ans.divide(BigInteger.valueOf(i));
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}