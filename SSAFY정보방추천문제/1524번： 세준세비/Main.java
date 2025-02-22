/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1524                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1524                           #+#        #+#      #+#    */
/*   Solved: 2025/02/21 23:09:28 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            br.readLine();
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int sMax = 0;
            int bMax = 0;

            int s;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                s = Integer.parseInt(st.nextToken());
                if (sMax < s)
                    sMax = s;
            }

            int b;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b = Integer.parseInt(st.nextToken());
                if (bMax < b)
                    bMax = b;
            }

            if (sMax >= bMax)
                sb.append("S").append("\n");
            else
                sb.append("B").append("\n");
        }
        System.out.print(sb);
    }
}