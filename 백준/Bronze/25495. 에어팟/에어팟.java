import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int batery = 2;
        int prev = 2;
        for (int i = 1; i < N; i++) {
            if (batery != 0 && arr[i - 1] == arr[i]) {
                prev = prev * 2;
                batery += prev;
            } else {
                prev = 2;
                batery += 2;
            }

            if (batery >= 100) {
                batery = 0;
            }
        }

        System.out.print(batery);
    }
}