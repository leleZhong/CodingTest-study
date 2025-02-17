/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 24523                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/24523                          #+#        #+#      #+#    */
/*   Solved: 2025/02/16 20:32:17 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int tmp = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] != arr[i]) {
                for (int j = tmp; j < i; j++) {
                    sb.append(i + 1).append(" ");
                }
                tmp = i;
            }
        }
        for (int i = tmp; i < n; i++) {
            sb.append(-1).append(" ");
        }
        
        System.out.print(sb);
    }
}