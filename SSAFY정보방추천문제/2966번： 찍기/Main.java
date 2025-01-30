/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2966                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2966                           #+#        #+#      #+#    */
/*   Solved: 2025/01/30 14:43:13 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[] ans = br.readLine().toCharArray();
        int[] score = new int[3];

        char[] adrian = {'A', 'B', 'C'};
        char[] bruno = {'B', 'A', 'B', 'C'};
        char[] goran = {'C', 'C', 'A', 'A', 'B', 'B'};

        for (int i = 0; i < n; i++) {
            if (ans[i] == adrian[i % adrian.length])
                score[0]++;
            if (ans[i] == bruno[i % bruno.length])
                score[1]++;
            if (ans[i] == goran[i % goran.length])
                score[2]++;
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        sb.append(maxScore).append("\n");
        
        if (score[0] == maxScore)
            sb.append("Adrian").append("\n");
        if (score[1] == maxScore)
            sb.append("Bruno").append("\n");
        if (score[2] == maxScore)
            sb.append("Goran").append("\n");

        System.out.print(sb);
    }
}