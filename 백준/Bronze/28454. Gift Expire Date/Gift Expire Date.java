import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cur = br.readLine();
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (N-- > 0) {
            String s = br.readLine();
            if (s.compareTo(cur) >= 0) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}