import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        int r = 31;
        int M = 1234567891;
        long hash = 0;
        for (int i = 0; i < L; i++) {
            long tmp = 1;
            for (int j = 0; j < i; j++) {
                tmp *= r;
                tmp %= M;
            }
            hash += (arr[i] - 'a' + 1) * tmp % M;
        }

        System.out.print(hash % M);
    }
}