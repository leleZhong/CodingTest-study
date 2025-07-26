import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int num = 665;
        while (cnt != N) {
            num++;
            if (check(num)) {
                cnt++;
            }
        }

        System.out.print(num);
    }

    static boolean check(int n) {
        int cnt6 = 0;
        while (n > 0) {
            if (n % 10 == 6) {
                cnt6++;
            } else {
                cnt6 = 0;
            }

            if (cnt6 >= 3) {
                return true;
            }
            n /= 10;
        }

        return false;
    }
}