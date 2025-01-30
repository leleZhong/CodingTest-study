/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 17362                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/17362                          #+#        #+#      #+#    */
/*   Solved: 2025/01/30 13:31:29 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] fingers = {2, 1, 2, 3, 4, 5, 4, 3}; // 8로 나눴을때 1, 2or0, 3or7, 4or6, 5

        int fingerNum = fingers[n % 8];

        System.out.print(fingerNum);
    }
}