import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.print(0);
            return;
        }
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dx = { -1, 0, 1 };
        int min = Integer.MAX_VALUE;
        boolean find1 = false;
        for (int d1 : dx) {
            for (int d2 : dx) {
                int cnt = 0;
                int a1 = arr[0] + d1;
                int a2 = arr[1] + d2;
                if (d1 != 0) cnt++;
                if (d2 != 0) cnt++;

                int diff = a2 - a1;
                int prev = a2;
                boolean find2 = true;
                for (int i = 2; i < N; i++) {
                    int expected = prev + diff;
                    int change = Math.abs(arr[i] - expected);
                    if (change > 1) {
                        find2 = false;
                        break;
                    }
                    if (change == 1) cnt++;
                    prev = expected;
                }
                if (find2) {
                    min = Math.min(min, cnt);
                    find1 = true;
                }
            }
        }
        System.out.print(find1 ? min : -1);
    }
}