/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10989                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10989                          #+#        #+#      #+#    */
/*   Solved: 2025/01/27 19:53:26 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[10001];
        int num = 0;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            arr[num]++;
        }
        for (int i = 1; i <= 10000; i++) {
            if (arr[i] == 0)
                continue;
            for (int j = 0; j < arr[i]; j++)
                sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}