/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1440                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1440                           #+#        #+#      #+#    */
/*   Solved: 2025/02/02 21:17:54 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.print(isValidTime(a, b, c) + isValidTime(a, c, b)
        + isValidTime(b, a, c) + isValidTime(b, c, a)
        + isValidTime(c, a, b) + isValidTime(c, b, a));
    }

    public static int isValidTime(int h, int m, int s) {
        return (h >= 1 && h <= 12 && m >= 0 && m <= 59 && s >= 0 && s <= 59) ? 1 : 0;
    }
}