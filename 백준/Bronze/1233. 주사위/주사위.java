import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());

        int[] arr = new int[81];
        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    arr[i + j + k]++;
                }
            }
        }

        int ans = 0;
        int max = 0;
        for (int i = 80; i >= 1; i--) {
            if (max <= arr[i]) {
                max = arr[i];
                ans = i;
            }
        }
        
        System.out.print(ans);
    }
}