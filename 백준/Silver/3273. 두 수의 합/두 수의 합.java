import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        int[] cnt = new int[x + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] < x)
                cnt[arr[i]]++;
        }

        int ans = 0;
        for (int i = 1; i <= (x - 1) / 2; i++) {
            if (cnt[i] == 1) {
                if (cnt[x - i] == 1)
                    ans++;
            }
        }

        System.out.print(ans);
    }
}