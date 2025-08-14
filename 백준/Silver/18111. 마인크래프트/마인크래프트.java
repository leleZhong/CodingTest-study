import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int maxH = 0;
        int minH = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                maxH = Math.max(maxH, arr[i][j]);
                minH = Math.min(minH, arr[i][j]);
            }
        }

        int minT = Integer.MAX_VALUE;
        int minTH = maxH;
        for (int h = 256; h >= 0; h--) {
            int inventory = B;
            int time = 0;
            boolean valid = true;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] > h) {
                        inventory += arr[i][j] - h;
                        time += 2 * (arr[i][j] - h);
                    } else if (arr[i][j] < h) {
                        inventory -= h - arr[i][j];
                        time += h - arr[i][j];

                    } else if (arr[i][j] == h) {
                        continue;
                    } else {
                        valid = false;
                        break;
                    }
                }

                if (!valid) {
                    break;
                }
            }

            if (inventory < 0) {
                valid = false;
            }

            if (valid) {
                if (time < minT) {
                    minT = time;
                    minTH = h;
                }
            }
        }

        System.out.print(minT + " " + minTH);
    }
}