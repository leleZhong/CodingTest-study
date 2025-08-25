import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[3][2];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int H = Integer.parseInt(br.readLine());

        int t = -1;
        while (H > 0) {
            t++;
            for (int i = 0; i < 3; i++) {
                if (t % arr[i][0] == 0) {
                    H -= arr[i][1];
                }
            }
        }

        System.out.print(t);
    }
}