/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2037                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2037                           #+#        #+#      #+#    */
/*   Solved: 2025/01/30 16:47:26 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        char[] str = br.readLine().toCharArray();
        
        String[] alphabets = {" ", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        int cnt = 0;
        int prevGroup = -1;
        for (char c : str) {
            for (int group = 0; group < alphabets.length; group++) {
                int pos = alphabets[group].indexOf(c);
                if (pos != -1) {
                    cnt += p * (1 + pos);
                    if (prevGroup == group && prevGroup!= 0)
                        cnt += w;
                    prevGroup = group;
                    break;
                }
            }
        }
        System.out.print(cnt);
    }
}