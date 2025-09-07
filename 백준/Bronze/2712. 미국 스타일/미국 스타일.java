import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());

            switch (st.nextToken()) {
                case "kg":
                    sb.append(String.format("%.4f", num * 2.2046)).append(" lb");
                    break;
                case "lb":
                    sb.append(String.format("%.4f", num * 0.4536)).append(" kg");
                    break;
                case "l":
                    sb.append(String.format("%.4f", num * 0.2642)).append(" g");
                    break;
                case "g":
                    sb.append(String.format("%.4f", num * 3.7854)).append(" l");
                    break;
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}