import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        double ans = 0;
        switch (s.charAt(0)) {
            case 'A':
                ans = 4.0;
                break;
            case 'B':
                ans = 3.0;
                break;
            case 'C':
                ans = 2.0;
                break;
            case 'D':
                ans = 1.0;
                break;
            case 'F':
                System.out.print(0.0);
                return;
        }
        switch (s.charAt(1)) {
            case '+':
                ans += 0.3;
                break;
            case '0':
                break;
            case '-':
                ans -= 0.3;
                break;
        }

        System.out.print(ans);
    }
}