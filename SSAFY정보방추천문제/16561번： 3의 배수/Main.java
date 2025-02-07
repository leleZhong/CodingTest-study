/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 16561                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/16561                          #+#        #+#      #+#    */
/*   Solved: 2025/02/07 20:56:02 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 3; i < n; i += 3) {
            for (int j = 3; j < n - i; j += 3) {
                int k = n - i - j;
                if (k >= 3 && k % 3 == 0)
                    cnt++;
            }
        }

        System.out.print(cnt);
    }
}