import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] arr = new int[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        arr[0][0] = 1;
        arr[1][1] = 1;

        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] tmp = fibonacci(N);

            sb.append(tmp[0]).append(" ").append(tmp[1]).append("\n");
        }
        
        System.out.print(sb);
    }

    static int[] fibonacci(int n) {
        if (arr[n][0] > 0 || arr[n][1] > 0)
            return arr[n];
        else {
            int[] fib1 = fibonacci(n - 1);
            int[] fib2 = fibonacci(n - 2);
            arr[n][0] = fib1[0] + fib2[0];
            arr[n][1] = fib1[1] + fib2[1];
            return arr[n];
        }
    }
}