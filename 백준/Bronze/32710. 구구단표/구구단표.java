import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean appear = false;
        for (int i = 2; i <= 9; i++) {
            if (N % i == 0 && N / i <= 9) {
                appear = true;
            }
        }

        System.out.print(appear || N == 1 ? 1 : 0);
    }
}