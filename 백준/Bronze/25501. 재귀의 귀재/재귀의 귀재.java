import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String S = br.readLine();
            cnt = 0;
            sb.append(isPal(S)).append(" ").append(cnt).append("\n");
        }

        System.out.print(sb);
    }

    static int isPal(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    static int recursion(String s, int l, int r) {
        cnt++;

        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l + 1, r - 1);
        }
    }
}