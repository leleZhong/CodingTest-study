import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][] arr = new long[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Long.parseLong(st.nextToken());
            arr[i][1] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) return Long.compare(a[0], b[0]);
            return Long.compare(a[1], b[1]);
        });

        int cnt = 0;
        long last = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i][0] >= last) {
                cnt++;
                last = arr[i][1];
            }
        }
        System.out.print(cnt);
    }
}