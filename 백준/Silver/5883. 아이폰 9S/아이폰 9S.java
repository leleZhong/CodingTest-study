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

        int max = 0;
        for (int remove : arr) {
            int cnt = 0;
            int prev = -1;
            for (int num : arr) {
                if (num == remove)
                    continue;
                if (num == prev)
                    cnt++;
                else {
                    prev = num;
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }
        System.out.print(max);
    }
}