import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int arr[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] degree90 = rotate(arr);
            int[][] degree180 = rotate(degree90);
            int[][] degree270 = rotate(degree180);

            sb.append("#").append(tc).append("\n");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(degree90[i][j]);
                }
                sb.append(" ");
                for (int j = 0; j < N; j++) {
                    sb.append(degree180[i][j]);
                }
                sb.append(" ");
                for (int j = 0; j < N; j++) {
                    sb.append(degree270[i][j]);
                }
                sb.append("\n");
            }
        }

        System.out.print(sb);
    }

    static int[][] rotate(int[][] arr) {
        int len = arr.length;
        int[][] rotate = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                rotate[i][j] = arr[len - 1 - j][i];
            }
        }
        return rotate;
    }
}