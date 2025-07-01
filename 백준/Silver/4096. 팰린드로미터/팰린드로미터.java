import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s.equals("0"))
                break;
            char[] arr = s.toCharArray();
            int len = arr.length;

            while (true) {
                for (int i = 0; i < len / 2; i++) {
                    arr[len - i - 1] = arr[i];
                }
                
                if (Integer.parseInt(s) > Integer.parseInt(new String(arr))) {
                    int carry = 1;
                    int idx = (len % 2 == 0) ? (len / 2 - 1) : (len / 2);
                    while (idx >= 0 && carry == 1) {
                        int d = (arr[idx] - '0') + carry;
                        arr[idx] = (char) ('0' + d % 10);
                        carry = d / 10;
                        idx--;
                    }
                } else
                    break;
            }

            int pal = Integer.parseInt(new String(arr));
            int ans = pal - Integer.parseInt(s);
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}