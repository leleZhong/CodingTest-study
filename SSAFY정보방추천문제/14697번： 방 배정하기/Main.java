/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 14697                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/14697                          #+#        #+#      #+#    */
/*   Solved: 2025/02/02 21:59:47 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean flag = false;
        outerLoop:
        for (int i = 0; i <= n / a; i++) {
            for (int j = 0; j <= n / b; j++) {
                for (int k = 0; k <= n / c; k++) {
                    if (a * i + b * j + c * k == n) {
                        flag = true;
                        break outerLoop;
                    }
                }
            }
        }
        System.out.print(flag ? 1 : 0);
    }
}