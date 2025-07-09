import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;
            
            sb.append(pal(s) ? "yes" : "no").append("\n");
        }
        System.out.print(sb);
    }

    static boolean pal(String s) {
        boolean valid = true;
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                valid = false;
                break;
            }
        }
        return valid;
    }
}