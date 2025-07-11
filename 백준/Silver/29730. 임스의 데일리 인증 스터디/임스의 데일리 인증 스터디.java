import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (a, b) -> {
            boolean aBoj = a.length() > 7 && a.substring(0, 7).equals("boj.kr/");
            boolean bBoj = b.length() > 7 && b.substring(0, 7).equals("boj.kr/");
            if (aBoj && bBoj) {
                return Integer.parseInt(a.substring(7)) - Integer.parseInt(b.substring(7));
            } else if (aBoj) {
                return 1;
            } else if (bBoj) {
                return -1;
            } else {
                if (a.length() != b.length()) {
                    return a.length() - b.length();
                }
                return a.compareTo(b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s + "\n");
        }

        System.out.print(sb);
    }
}