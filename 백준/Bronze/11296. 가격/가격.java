import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double price = Double.parseDouble(st.nextToken());
            char dots = st.nextToken().charAt(0);
            char coupon = st.nextToken().charAt(0);
            char pay = st.nextToken().charAt(0);

            int discount = 0;
            switch (dots) {
                case 'R':
                    discount += 45;
                    break;
                case 'G':
                    discount += 30;
                    break;
                case 'B':
                    discount += 20;
                    break;
                case 'Y':
                    discount += 15;
                    break;
                case 'O':
                    discount += 10;
                    break;
                case 'W':
                    discount += 5;
                    break;
            }
            price = price * (1 - discount / 100.0);
            if (coupon == 'C') {
                price = price * (1 - 5 / 100.0);
            }
            sb.append("$").append(pay == 'C' ? String.format("%.2f", Math.round(price * 10) / 10.0) : String.format("%.2f", price)).append("\n");
        }
        System.out.println(sb);
    }
}