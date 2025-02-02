/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 14568                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/14568                          #+#        #+#      #+#    */
/*   Solved: 2025/01/31 13:48:45 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 2; i <= n - 2; i += 2) {   // ÅÃÈñ
            for (int j = 1; j < n - i - 1; j++) {   // ¿µÈÆ
                int k = n - i - j;  // ³²±Ô
                if (k >= j + 2)
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}