/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2292                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2292                           #+#        #+#      #+#    */
/*   Solved: 2025/01/25 16:15:31 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

// 1 7 19 37 61
// 6 18 36 60
// 1 3  6  10
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 1)
            System.out.println(1);
        else {
            int room = 1; // 현재 위치한 층의 최댓값 (7, 19, 37...)
            int step = 1; // 몇 개의 방을 지나갔는지

            while (n > room) {
                room += 6 * step;
                step++;
            }
            System.out.println(step);
        }
    }
}