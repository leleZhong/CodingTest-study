/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4673                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4673                           #+#        #+#      #+#    */
/*   Solved: 2025/02/22 23:11:27 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.IOException;

public class Main {
    static boolean[] arr = new boolean[10001];
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < arr.length; i++) {
            d(i);
        }

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i])
                sb.append(i).append("\n");
        }
        System.out.print(sb);
    }

    static void d(int n) {
        int dn = n;
        while (n != 0) {
            dn += n % 10;
            n /= 10;
        }
        if (dn <= 10000)
            arr[dn] = true;
    }
}