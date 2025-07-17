import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cur = Integer.parseInt(st.nextToken());
        boolean isAs = true;
        boolean isDes = true;
        while (st.hasMoreTokens()) {
            int next = Integer.parseInt(st.nextToken());
            if (cur > next) {
                isAs = false;
            } else if (cur < next) {
                isDes = false;
            } else {
                isAs = isDes = false;
                break;
            }
            
            cur = next;
        }

        System.out.print(isAs ? "ascending" : isDes ? "descending" : "mixed");
    }
}