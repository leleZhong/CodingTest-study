import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        boolean aWin = false;
        for (int i = 2; i >= 0; i--) {
            if (A.charAt(i) > B.charAt(i)) {
                aWin = true;
                break;
            } else if (A.charAt(i) < B.charAt(i)) {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i >= 0; i--) {
            if (aWin) {
                sb.append(A.charAt(i));
            } else {
                sb.append(B.charAt(i));
            }
        }

        System.out.print(sb);
    }
}