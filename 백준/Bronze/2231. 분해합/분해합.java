import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input);
        int ans = 0;

        for (int i = 1; i < N; i++) {
            int sum = i;
            int tmp = i;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if (sum == N) {
                ans = i;
                break;
            }
        }
        System.out.print(ans);
    }
}