import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] censor = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
        char[] input = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char i : input) {
            boolean censored = false;
            for (char c : censor) {
                if (i == c) {
                    censored = true;
                    break;
                }
            }
            if (!censored)
                sb.append(i);
        }

        System.out.print(sb);
    }
}