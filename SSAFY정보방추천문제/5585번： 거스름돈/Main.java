/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 5585                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/5585                           #+#        #+#      #+#    */
/*   Solved: 2025/01/30 15:34:39 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.parseInt(br.readLine());
        
        int[] coins = {500, 100, 50, 10, 5, 1};
        int change = 1000 - cost;
        int cnt = 0;
        for (int i = 0; i < coins.length; i++) {
            if (change == 0)
                break;
            cnt += change / coins[i];
            change %= coins[i];
        }
        System.out.print(cnt);
    }
}