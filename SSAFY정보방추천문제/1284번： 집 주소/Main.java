/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1284                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1284                           #+#        #+#      #+#    */
/*   Solved: 2025/01/30 13:50:07 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String n;
        int[] nums = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        int width;

        while (!(n = br.readLine()).equals("0")) {
            width = n.length() + 1;
            for (int i = 0; i < n.length(); i++) {
                width += nums[n.charAt(i) - '0'];
            }
            sb.append(width).append("\n");
        }
        System.out.print(sb);
    }
}