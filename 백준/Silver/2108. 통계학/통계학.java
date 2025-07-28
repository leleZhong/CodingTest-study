import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] nums = new int[8001];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            nums[arr[i] + 4000]++;
        }
        Arrays.sort(arr);

        int maxFreq = 0;
        for (int i = 0; i < nums.length; i++) {
            maxFreq = Math.max(maxFreq, nums[i]);
        }

        int idx = -1;
        boolean findFirst = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxFreq) {
                if (!findFirst) {
                    idx = i - 4000;
                    findFirst = true;
                } else {
                    idx = i - 4000;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(Math.round((double) sum / N)).append("\n");
        sb.append(arr[N / 2]).append("\n");
        sb.append(idx).append("\n");
        sb.append(arr[N - 1] - arr[0]);

        System.out.print(sb);
    }
}