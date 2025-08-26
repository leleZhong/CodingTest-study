import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                sb.append("Deficient\n");
                continue;
            }

            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            sb.append(sum > num ? "Abundant" : sum < num ? "Deficient" : "Perfect").append("\n");
        }

        System.out.print(sb);
    }
}