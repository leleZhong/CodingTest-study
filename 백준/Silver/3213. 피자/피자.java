import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"1/4", "1/2", "3/4"};

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[3];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < 3; j++) {
                if (arr[j].equals(input))
                    num[j]++;
            }
        }

        int ans = 0;
        
        int pair = Math.min(num[0], num[2]);
        ans += pair;
        num[0] -= pair;
        num[2] -= pair;
        
        ans += num[2];

        ans += num[1] / 2;
        num[1] %= 2;

        if (num[1] == 1) {
            ans += 1;
            num[0] -= Math.min(2, num[0]);
        }

        ans += num[0] / 4;
        if (num[0] % 4 != 0)
            ans++;

        System.out.print(ans);
    }
}