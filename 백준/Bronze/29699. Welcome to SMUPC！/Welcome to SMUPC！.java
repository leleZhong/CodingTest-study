import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "WelcomeToSMUPC";
        System.out.print(s.charAt((Integer.parseInt(br.readLine()) - 1) % 14));
    }
}