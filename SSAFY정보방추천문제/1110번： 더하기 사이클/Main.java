/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1110                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1110                           #+#        #+#      #+#    */
/*   Solved: 2025/02/11 17:59:38 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int newNum = n;
        int cycle = 0;

        while (true) {
            int left = newNum / 10;
            int right = newNum % 10;

            newNum = right * 10 + (left + right) % 10;
            cycle++;
            
            if (newNum == n)
                break;
        }

        System.out.print(cycle);
    }
}