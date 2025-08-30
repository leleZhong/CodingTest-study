import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String X = br.readLine();

        if (X.charAt(0) == '0') {
            if (X.charAt(1) == 'x') {
                System.out.print(Integer.parseInt(X.substring(2), 16));
            } else {
                System.out.print(Integer.parseInt(X.substring(1), 8));
            }
        } else {
            System.out.print(X);
        }
    }
}