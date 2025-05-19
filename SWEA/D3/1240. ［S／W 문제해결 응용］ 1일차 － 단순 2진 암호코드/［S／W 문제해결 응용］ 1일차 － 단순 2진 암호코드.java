import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static String[] code = {"0001101", "0011001", "0010011", "0111101", "0100011",
                            "0110001", "0101111", "0111011", "0110111", "0001011"};
    static int[] num;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            String[] arr = new String[N];
            for (int i = 0; i < N; i++) {
                arr[i] = br.readLine();
            }

            String[] scan = new String[8];
            for (int i = 0; i < N; i++) {
                boolean find = false;
                for (int j = M - 1; j >= 55; j--) {
                    if (arr[i].charAt(j) == '1') {
                        int start = j - 55;
                        for (int k = 0; k < 8; k++) {
                            scan[k] = arr[i].substring(start, start + 7);
                            start += 7;
                        }
                        
                        find = true;
                        break;
                    }
                }

                if (find)
                    break;
            }

            num = new int[8];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 10; j++) {
                    if (scan[i].equals(code[j])) {
                        num[i] = j;
                        break;
                    }
                }
            }

            int ans = 0;
            if (isValid()) {
                for (int i = 0; i < 8; i++) {
                    ans += num[i];
                }
            }
            
            sb.append(ans).append("\n");
        }
        
        System.out.print(sb);
    }

    static boolean isValid() {
        int sum = 0;
        for (int i = 0; i < 8; i += 2) {
            sum += num[i];
        }

        sum *= 3;

        for (int i = 1; i < 8; i += 2) {
            sum += num[i];
        } 

        if (sum != 10 && sum % 10 == 0)
            return true;
        else return false;
    }
}
