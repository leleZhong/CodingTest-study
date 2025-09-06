import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        StringBuilder sb = new StringBuilder();
        while(!(s = br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());   // 나무의 나이

            int ans = 1;
            for (int i = 0; i < a; i++) {
                ans *= Integer.parseInt(st.nextToken());
                ans -= Integer.parseInt(st.nextToken());
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}