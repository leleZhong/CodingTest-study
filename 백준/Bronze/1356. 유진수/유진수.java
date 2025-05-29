import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        boolean possible = false;
        for (int i = 1; i < s.length(); i++) {
            String front = s.substring(0, i);
            String back = s.substring(i);

            int fMul = 1;
            for (int j = 0; j < front.length(); j++) {
                fMul *= front.charAt(j) - '0';
            }
            int bMul = 1;
            for (int j = 0; j < back.length(); j++) {
                bMul *= back.charAt(j) - '0';
            }

            if (fMul == bMul) {
                possible = true;
                break;
            }
        }

        System.out.print(possible ? "YES" : "NO");
    }
}