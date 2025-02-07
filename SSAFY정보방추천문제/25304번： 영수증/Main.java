/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 25304                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/25304                          #+#        #+#      #+#    */
/*   Solved: 2025/02/06 23:37:17 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int cost = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            cost += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        
        System.out.print(cost == x ? "Yes" : "No");
    }
}