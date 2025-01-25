/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2231                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2231                           #+#        #+#      #+#    */
/*   Solved: 2025/01/25 14:53:55 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int output = 0;
        for (int i=1; i < n; i++) {
            int sum = 0;
            int tmp = i;
            while (tmp != 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if (n == i + sum) {
                output = i;
                break;
            }
        }
        System.out.println(output);
    }
}