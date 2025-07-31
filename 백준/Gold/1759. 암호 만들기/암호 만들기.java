import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int L, C;
    static char[] arr, ans;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new char[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(arr);

        ans = new char[L];

        recur(0, 0, 0, 0);

        System.out.print(sb);
    }

    static void recur(int idx, int cnt, int vCnt, int cCnt) {
        if (cnt == L) {
            if (vCnt >= 1 && cCnt >= 2) {
                for (char c : ans) {
                    sb.append(c);
                }
                sb.append("\n");
            }
            return;
        }

        if (idx == C) {
            return;
        }

        ans[cnt] = arr[idx];
        if (isV(ans[cnt])) {
            recur(idx + 1, cnt + 1, vCnt + 1, cCnt);
        } else {
            recur(idx + 1, cnt + 1, vCnt, cCnt + 1);
        }
        recur(idx + 1, cnt, vCnt, cCnt);
    }

    static boolean isV(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}