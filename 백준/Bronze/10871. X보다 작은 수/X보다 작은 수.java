import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N --> 0) {
            int a = Integer.parseInt(st.nextToken());
            if (a < X) {
                sb.append(a).append(" ");
            }
        }

        System.out.print(sb);
    }
}