import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int sum = 0;
        int plus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '*') {
                plus = i % 2 == 0 ? 1 : 3;
            } else {
                int tmp = i % 2 == 0 ? 1 : 3;
                sum += (arr[i] - '0') * tmp;
            }
        }

        for (int i = 0; i <= 9; i++) {
            if ((sum + i * plus) % 10 == 0) {
                System.out.print(i);
            }
        } 
    }
}