import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        boolean find = false;
        int ans1 = 0, ans2 = 0;
        for (int i = 1; i <= n - 1; i++) {
            if (i * a + (n - i) * b == w) {
                if (!find) {
                    ans1 = i;
                    ans2 = n - i;
                    find = true;
                }
                else {
                    find = false;
                    break;
                }
            }
        }

        System.out.print(find ? ans1 + " " + ans2 : -1);
    }
}