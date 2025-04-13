import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] N = br.readLine().toCharArray();

        int[] isUsed = new int[10];
        int sixCnt = 0;
        for (char c : N) {
            int num = c - '0';

            if (num == 6 || num == 9) {
                sixCnt++;
                continue;
            }
            isUsed[num]++;
        }
        Arrays.sort(isUsed);

        sixCnt = (sixCnt % 2 == 0) ? sixCnt / 2 : sixCnt / 2 + 1;
        System.out.print(Math.max(isUsed[9], sixCnt));
    }
}