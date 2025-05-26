import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == j || i == k || j == k)
                        continue;
                    
                    if (isValid(nums[i], nums[j], nums[k]))
                        ans++;
                }
            }
        }

        System.out.print(ans);
    }

    static boolean isValid(int HH, int MM, int SS) {
        if (HH >= 1 && HH <= 12 && MM >= 0 && MM <= 59 && SS >= 0 && SS <= 59)
            return true;
        return false;
    }
}