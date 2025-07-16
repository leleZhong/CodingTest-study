import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 1;
        for (int i = Integer.parseInt(br.readLine()); i > 0; i--) {
            ans *= i;
        }

        System.out.print(ans);
    }
}