import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[][] fib = new int[41][2];
        fib[0][1] = fib[1][0] = 0;
        fib[0][0] = fib[1][1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i][0] = fib[i - 1][0] + fib[i - 2][0];
            fib[i][1] = fib[i - 1][1] + fib[i - 2][1];
        }

        StringBuilder sb = new StringBuilder();
        while (T --> 0) {
            int N = Integer.parseInt(br.readLine());
            sb.append(fib[N][0]).append(" ").append(fib[N][1]).append("\n");
        }

        System.out.print(sb);
    }
}