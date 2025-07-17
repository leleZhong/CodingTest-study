import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T --> 0) {
            String s = br.readLine();
            int score = 0;
            int tmp = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'O') {
                    score += ++tmp;
                } else {
                    tmp = 0;
                }
            }
            sb.append(score).append("\n");
        }

        System.out.print(sb);
    }
}