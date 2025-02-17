/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2851                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2851                           #+#        #+#      #+#    */
/*   Solved: 2025/02/17 22:14:37 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mushrooms = new int[10];

        int sum = 0;
        for (int i = 0; i < mushrooms.length; i++) {
            mushrooms[i] = Integer.parseInt(br.readLine());
            sum += mushrooms[i];
            if (sum >= 100) {
                int diff = sum - 100;
                if (diff > 100 - (sum -  mushrooms[i]))
                    sum -= mushrooms[i];
                break;
            }
        }

        System.out.print(sum);
    }
}