import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (C --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            int[] arr = new int[N];
            double sum = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            double avg = sum / N;
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] > avg) {
                    cnt++;
                }
            }

            sb.append(String.format("%.3f", (double) cnt / N * 100)).append("%\n");
        }

        System.out.print(sb);
    }
}