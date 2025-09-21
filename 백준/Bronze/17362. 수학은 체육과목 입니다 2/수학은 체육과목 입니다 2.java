import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = (Integer.parseInt(br.readLine()) - 1) % 8 + 1;
        System.out.print(ans > 5 ? 10 - ans : ans);
    }
}