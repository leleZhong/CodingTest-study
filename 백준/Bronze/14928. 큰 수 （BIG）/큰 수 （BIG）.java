import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        long ans = 0;
        for (int i = 0; i < N.length(); i++) {
            ans = (ans * 10 + (N.charAt(i) - '0')) % 20000303;
        }
        System.out.print(ans);
    }
}