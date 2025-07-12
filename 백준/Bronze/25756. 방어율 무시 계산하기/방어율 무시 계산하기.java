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
        double V = 0;
        while (N --> 0) {
            V = (1 - (1 - V / 100) * (1 - Double.parseDouble(st.nextToken()) / 100)) * 100;
            sb.append(String.format("%.6f", V)).append("\n");
        }

        System.out.print(sb);
    }
}