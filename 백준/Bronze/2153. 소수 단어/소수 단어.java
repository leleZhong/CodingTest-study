import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a') {
                sum += s.charAt(i) - 'a' + 1;
            } else {
                sum += s.charAt(i) - 'A' + 27;
            }
            
        }

        boolean[] arr = new boolean[sum + 1];
        for (int i = 2; i * i <= sum; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= sum; j += i) {
                arr[j] = true;
                }
            }
        }

        System.out.println(arr[sum] ? "It is not a prime word." : "It is a prime word.");
    }
}