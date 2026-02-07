import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("Case #").append(tc).append(": ");
            int N = Integer.parseInt(br.readLine());
            if (N > 4500) {
                sb.append("Round 1");
            } else if (N > 1000) {
                sb.append("Round 2");
            } else if (N > 25) {
                sb.append("Round 3");
            } else {
                sb.append("World Finals");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}