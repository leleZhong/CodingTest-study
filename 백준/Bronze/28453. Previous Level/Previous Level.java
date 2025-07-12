import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            int M = Integer.parseInt(st.nextToken());
            sb.append(M < 250 ? 4 : M < 275 ? 3 : M < 300 ? 2 : 1).append(" ");
        }

        System.out.print(sb);
    }
}