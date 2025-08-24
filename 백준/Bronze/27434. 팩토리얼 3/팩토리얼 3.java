import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print(N == 0 ? 1 : factorial(1, N));
    }

    static BigInteger factorial(int s, int e) {
        if (s == e) {
            return BigInteger.valueOf(e);
        }

        return factorial(s, (s + e) / 2).multiply(factorial((s + e) / 2 + 1, e));
    }
}