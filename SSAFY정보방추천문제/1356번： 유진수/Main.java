/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1356                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1356                           #+#        #+#      #+#    */
/*   Solved: 2025/02/02 23:04:30 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        boolean flag = false;
        for (int i = 1; i < n.length(); i++) {
            int product1 = 1;
            int product2 = 1;

            for (int j = 0; j < i; j++) {
                product1 *= n.charAt(j) - '0';
            }
            for (int j = i; j < n.length(); j++) {
                product2 *= n.charAt(j) - '0';
            }
            if (product1 == product2) {
                flag = true;
                break;
            }
        }
        System.out.print(flag ? "YES" : "NO");
    }
}