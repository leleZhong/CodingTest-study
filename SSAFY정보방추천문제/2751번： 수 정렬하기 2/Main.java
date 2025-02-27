/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2751                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2751                           #+#        #+#      #+#    */
/*   Solved: 2025/02/27 16:43:31 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[2000001];
        for (int i = 0; i < n; i++) {
            int idx = Integer.parseInt(br.readLine());
            arr[idx + 1000000] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            if (arr[i]) {
                sb.append(i - 1000000).append("\n");
                if (++cnt == n)
                    break;
            }
        }
        System.out.println(sb);
    }
}