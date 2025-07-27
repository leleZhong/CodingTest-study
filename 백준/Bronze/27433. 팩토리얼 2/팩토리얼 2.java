import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        if (N == 0) {
            System.out.print(1);
            return;
        }

        long ans = 1;
        for (int i = N; i > 0; i--) {
            ans *= i;
        }

        System.out.print(ans);
    }
}