import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) < 'a' ? (char)(s.charAt(i) + 'a' - 'A') : (char)(s.charAt(i) + 'A' - 'a'));
        }

        System.out.print(sb);
    }
}