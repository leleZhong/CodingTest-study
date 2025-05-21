import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int max = -1;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    int num = arr[i] * arr[j];
                    int tmp = num;
                    boolean isValid = true;
                    while (tmp > 0) {
                        int a = tmp % 10;
                        tmp /= 10;
                        int b = tmp % 10;

                        if (a < b) {
                            isValid = false;
                            break;
                        }
                    }

                    if (isValid) {
                        max = Math.max(max, num);
                    }
                }
            }

            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }
}
