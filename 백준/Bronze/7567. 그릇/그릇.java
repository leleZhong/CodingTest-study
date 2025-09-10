import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int ans = 10;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                ans += 5;
            } else {
                ans += 10;
            }
        }

        System.out.print(ans);
    }
}