import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = {br.readLine(), br.readLine(), br.readLine()};
        int num = 0;
        for (int i = 0; i < 3; i++) {
            if (input[i].equals("FizzBuzz")) {
            } else if (input[i].equals("Fizz")) {
            } else if (input[i].equals("Buzz")) {
            } else {
                num = Integer.parseInt(input[i]) + 3 - i;
            }
        }

        if (num % 15 == 0) {
            System.out.print("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.print("Fizz");
        } else if (num % 5 == 0) {
            System.out.print("Buzz");
        } else {
            System.out.print(num);
        }
    }
}