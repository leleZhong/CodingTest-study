import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (char c : br.readLine().toCharArray()) {
            sb.append(c < 'a' ? (char)(c + 'a' - 'A') : (char)(c + 'A' - 'a'));
        }

        System.out.print(sb);
    }
}