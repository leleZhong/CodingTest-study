import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            boolean time[] = new boolean[1001];
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                for (int t = arr[j][0]; t < arr[j][1]; t++) {
                    time[t] = true;
                }
            }

            int sum = 0;
            for (int j = 0; j < 1001; j++) {
                if (time[j])
                    sum++;
            }

            max = Math.max(max, sum);
        }
        System.out.print(max);
    }
}