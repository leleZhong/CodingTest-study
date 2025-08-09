import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        int a = num * (arr[2] - '0');
        int b = num * (arr[1] - '0');
        int c = num * (arr[0] - '0');

        System.out.print(a + "\n" + b + "\n" + c + "\n" + (a + b * 10 + c * 100));
    }
}