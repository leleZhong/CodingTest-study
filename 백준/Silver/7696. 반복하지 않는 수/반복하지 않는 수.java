import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] nums = new int[1000001];
        int cnt = 1;
        boolean[] arr = new boolean[10];
        for (int i = 1; cnt <= 1000000; i++) {
            Arrays.fill(arr, false);
            int tmp = i;
            boolean possible = true;
            while (tmp > 0) {
                if (!arr[tmp % 10]) {
                    arr[tmp % 10] = true;
                    tmp /= 10;
                } else {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                nums[cnt] = i;
                cnt++;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;

            sb.append(nums[n]).append("\n");
        }
        System.out.print(sb);
    }
}