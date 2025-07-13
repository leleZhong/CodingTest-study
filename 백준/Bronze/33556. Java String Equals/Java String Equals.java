import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        A = "null".equals(A) ? null : A;
        B = "null".equals(B) ? null : B;

        try {
            System.out.println(A.equals(B) ? "true" : "false");
            System.out.print(A.equalsIgnoreCase(B) ? "true" : "false");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            System.out.print("NullPointerException");
        }
    }
}