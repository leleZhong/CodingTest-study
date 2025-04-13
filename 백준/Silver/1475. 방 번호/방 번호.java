import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] N = br.readLine().toCharArray();

        int[] nums = new int[10];
        for (char c : N) {
            int num = c - '0';
            nums[num]++;
        }
        nums[6] = nums[9] = (nums[6] + nums[9] + 1) / 2;
        
        int result = 0;
        for (int i : nums) {
            if (result < i)
                result = i;
        }

        System.out.print(result);
    }
}