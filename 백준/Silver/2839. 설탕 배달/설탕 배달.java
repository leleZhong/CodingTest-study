import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        boolean valid = false;
        for (int i = 0; i <= N / 5; i++) {
            int tmp = N - i * 5;
            if (tmp % 3 == 0) {
                min = Math.min(min, i + tmp / 3);
                valid = true;
            }
        }

        System.out.print(valid ? min : -1);
    }
}