/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1546                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1546                           #+#        #+#      #+#    */
/*   Solved: 2025/01/26 22:02:25 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st  = new StringTokenizer(br.readLine());
        float scores[] = new float[n];

        float maxScore = 0;
        float sum = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = Float.parseFloat(st.nextToken());
            maxScore = Math.max(maxScore, scores[i]);
            sum += scores[i];
        }
        System.out.println(sum / maxScore * 100 / n);
    }
}