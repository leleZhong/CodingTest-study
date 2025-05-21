import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int num = Integer.parseInt(br.readLine());
            sb.append("#").append(num).append(" ");

            String find = br.readLine();
            String search = br.readLine();

            int cnt = 0;
            for (int i = 0; i < search.length() - find.length() + 1; i++) {
                if (search.charAt(i) == find.charAt(0)) {
                    boolean isFind = true;
                    int start = i + 1;
                    for (int j = 1; j < find.length(); j++) {
                        if (search.charAt(start++) != find.charAt(j)) {
                            isFind = false;
                            break;
                        }
                    }
                    if (isFind)
                        cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}
