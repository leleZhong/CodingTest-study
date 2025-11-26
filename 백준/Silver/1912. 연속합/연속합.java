import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] sum = new int[n + 1];

        int min = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i + 1] = sum[i] + arr[i];

            max = Math.max(max, sum[i + 1] - min);
            min = Math.min(min, sum[i + 1]);
        }
        
        System.out.println(max);
    }
}