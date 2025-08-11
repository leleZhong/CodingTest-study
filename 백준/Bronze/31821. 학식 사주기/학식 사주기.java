import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int M = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += arr[Integer.parseInt(br.readLine()) - 1];
        }

        System.out.print(sum);
    }
}