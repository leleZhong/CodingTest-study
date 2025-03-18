import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[] alphabets = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();

        int[] used = new int[alphabets.length / 2];
        for (char w : word) {
            for (int j = 0; j < alphabets.length; j++) {
                if (w == alphabets[j]) {
                    used[j % 26]++;
                }
            }
        }

        int maxCnt = 0;
        int maxIdx = 0;
        for (int i = 0; i < used.length; i++) {
            if (used[i] > maxCnt) {
                maxCnt = used[i];
                maxIdx = i;
            }
        }

        int cnt = 0;
        for (int i = 0; i < used.length; i++) {
            if (used[i] == maxCnt) {
                cnt++;
            }
        }

        if (cnt == 1)
            System.out.print(alphabets[maxIdx]);
        else
            System.out.print("?");
    }
}