import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int[] nums = new int[3];
        int cntH = 0, cntMS = 0;
        for (int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            if (nums[i] >= 1 && nums[i] <= 12)
                cntH++;
            else if (nums[i] <= 59)
                cntMS++;
            else {
                System.out.print(0);
                return;
            }
        }

        int ans = 0;
        if (cntH == 0)
            ans = 0;
        else if (cntH == 1) {
            ans = 2;
        }
        else if (cntH == 2) {
            ans = 4;
        }
        else {
            ans = 6;
        }

        System.out.print(ans);
    }
}