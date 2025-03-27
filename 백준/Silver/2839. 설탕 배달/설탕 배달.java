import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt3 = N / 3;
        int min = Integer.MAX_VALUE;
        boolean exact = false;
        while (cnt3 >= 0) {
            int remain = N - cnt3 * 3;
            if (remain % 5 == 0) {
                int cnt5 = remain / 5;
                min = Math.min(min, cnt3 + cnt5);
                exact = true;
            }
            cnt3--;
        }
        if (exact)
            System.out.print(min);
        else
            System.out.print(-1);
    }
}