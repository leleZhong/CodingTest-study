import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int ans = 0;
        int len = N.length();
        for (int i = 0; i < len; i++) {
            if (N.charAt(len - i - 1) >= 'A') {
                ans += (int) Math.pow(B, i) * (N.charAt(len - i - 1) - 'A' + 10);
            } else {
                ans += (int) Math.pow(B, i) * (N.charAt(len - i - 1) - '0');
            }
        }

        System.out.println(ans);
    }
}