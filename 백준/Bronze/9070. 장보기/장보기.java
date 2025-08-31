import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T --> 0) {
            int N = Integer.parseInt(br.readLine());

            int[][] arr = new int[N][2];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, (a, b) -> a[1] - b[1]);

            double max = 0;
            int cost = 0;
            for (int[] tmp : arr) {
                double n = (double) tmp[0] / tmp[1];
                if (max < n) {
                    max = n;
                    cost = tmp[1];
                }
            }

            sb.append(cost).append("\n");
        }

        System.out.print(sb);
    }
}