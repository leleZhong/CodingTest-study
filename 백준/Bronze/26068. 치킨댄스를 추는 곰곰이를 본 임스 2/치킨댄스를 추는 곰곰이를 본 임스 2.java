import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (N --> 0) {
            if (Integer.parseInt(br.readLine().substring(2)) <= 90) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}