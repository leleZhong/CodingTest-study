import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int result = 0;
        StringTokenizer plus = new StringTokenizer(st.nextToken(), "+");
        while (plus.hasMoreTokens()) {
            result += Integer.parseInt(plus.nextToken());
        }

        while (st.hasMoreTokens()) {
            plus = new StringTokenizer(st.nextToken(), "+");

            int tmp = 0;
            while (plus.hasMoreTokens()) {
                tmp += Integer.parseInt(plus.nextToken());
            }

            result -= tmp;
        }

        System.out.print(result);
    }
}