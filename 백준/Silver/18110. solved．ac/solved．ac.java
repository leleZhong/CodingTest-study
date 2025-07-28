import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        if (n == 0) {
            System.out.print(0);
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int border = (int) Math.round(n * 0.15);
        int sum = 0;
        for (int i = border; i < n - border; i++) {
            sum += arr[i];
        }

        System.out.print(Math.round((double)sum / (n - border * 2)));
    }
}