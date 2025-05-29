import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean[] notPrime = new boolean[1000001];
        notPrime[0] = true; notPrime[1] = true;
        for (int i = 2; i * i < notPrime.length; i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j < notPrime.length; j += i) {
                    notPrime[j] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());

            boolean flag = true;
            for (int j = 2; j < notPrime.length; j++) {
                if (!notPrime[j]) {
                    if (num % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            sb.append(flag ? "YES" : "NO").append("\n");
        }

        System.out.print(sb);
    }
}