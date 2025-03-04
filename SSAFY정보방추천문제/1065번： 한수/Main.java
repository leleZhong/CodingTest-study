/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1065                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1065                           #+#        #+#      #+#    */
/*   Solved: 2025/03/04 17:57:29 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] num = new int[3];
        int cnt = 0;
        if (n < 100)
            cnt = n;
        else {
            cnt = 99;
            for (int i = n; i > 100; i--) {
                int tmp = i;
                if (i == 1000)
                    continue;
                for (int j = 0; j < 3; j++) {
                    num[j] = tmp % 10;
                    tmp /= 10;
                }
                if (num[0] - num[1] == num[1] - num[2])
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}