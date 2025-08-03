import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        int ans = 1;
        while (ans <= arr[0]) {
            boolean valid = true;
            for (int i = 0; i < n; i++) {
                if (arr[i] % ans != 0) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                sb.append(ans).append("\n");
            }
            ans++;
        }

        System.out.print(sb);
    }
}