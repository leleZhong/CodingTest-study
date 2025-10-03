import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (N --> 0) {
            int M = Integer.parseInt(br.readLine());

            long[][] arr = new long[M][3];
            for (int i = 0; i < M; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] += Long.parseLong(st.nextToken());
                arr[i][1] += Long.parseLong(st.nextToken());
                arr[i][2] += Long.parseLong(st.nextToken());
            }

            long sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            for (int i = 0; i < M; i++) {
                long tmp = 0;
                tmp += k * arr[i][0];
                tmp -= d * arr[i][1];
                tmp += a * arr[i][2];

                sum += tmp < 0 ? 0 : tmp;
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}