/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2609                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2609                           #+#        #+#      #+#    */
/*   Solved: 2025/01/26 22:23:05 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        int gcd = GCD(max, min);
        int lcm = n * m;
        if (gcd != 1)
            lcm /= gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int GCD(int a, int b) {
        if (b == 0)
            return a;
        return GCD(b, a%b);
    }
}