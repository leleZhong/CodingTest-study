import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (n == 0) {
            System.out.print(0);
            return;
        }

        Arrays.sort(arr);
        int except = (int) Math.round(n * 0.15);
        float sum = 0;
        for (int i = except; i < n - except; i++) {
            sum += arr[i];
        }
        int ans = (int) Math.round(sum / (n - except * 2));
        System.out.print(ans);
    }
}