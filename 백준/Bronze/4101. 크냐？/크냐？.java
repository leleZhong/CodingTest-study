import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        StringBuilder sb = new StringBuilder();
        while (!(s = br.readLine()).equals("0 0")) {
            StringTokenizer st = new StringTokenizer(s);
            sb.append(Integer.parseInt(st.nextToken()) > Integer.parseInt(st.nextToken()) ? "Yes" : "No").append("\n");
        }

        System.out.print(sb);
    }
}