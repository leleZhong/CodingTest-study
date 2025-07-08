import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static int K;
    static int[][] arr;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[2]));

        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = arr[i][0];
            b[i] = arr[i][1];
        }

        int min = Integer.MAX_VALUE;
        for (int x : a) {
            for (int y : b) {
                int cnt = 0;
                int z = 0;
                for (int i = 0; i < N; i++) {
                    if (arr[i][0] <= x && arr[i][1] <= y) {
                        cnt++;
                        z = arr[i][2];
                        if (cnt == K)
                            break;
                    }
                }

                if (cnt == K)
                    min = Math.min(min, x + y + z);
            }
        }
        System.out.print(min);
    }
}