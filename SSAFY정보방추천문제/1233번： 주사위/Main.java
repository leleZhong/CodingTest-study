/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1233                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1233                           #+#        #+#      #+#    */
/*   Solved: 2025/01/31 19:07:08 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        int s3 = Integer.parseInt(st.nextToken());

        int[] sumCnt = new int[81]; // idx가 80까지 있어야 하므로
        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    sumCnt[i + j + k]++;
                }
            }
        }
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < sumCnt.length; i++) {
            if (sumCnt[i] > max) {
                max = sumCnt[i];
                maxIdx = i;
            }
        }
        System.out.print(maxIdx);
    }
}