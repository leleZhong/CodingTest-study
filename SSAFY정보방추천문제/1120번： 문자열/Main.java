/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1120                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1120                           #+#        #+#      #+#    */
/*   Solved: 2025/03/05 20:14:25 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        int cnt;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= b.length() - a.length(); i++) {
            cnt = 0;
            for (int j = 0; j < a.length(); j++) {
                if (b.charAt(i + j) != a.charAt(j))
                    cnt++;
            }
            min = Math.min(min, cnt);
        }
        System.out.print(min);
    }
}