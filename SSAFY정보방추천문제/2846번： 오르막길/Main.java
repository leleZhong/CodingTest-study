/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2846                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2846                           #+#        #+#      #+#    */
/*   Solved: 2025/02/16 11:09:13 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int currentHeight = 0;
        int max = 0;
        
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i])
                currentHeight += arr[i] - arr[i - 1];
            else {
                if (currentHeight > max)
                    max = currentHeight;
                currentHeight = 0;
            }
        }

        if (currentHeight > max)
            max = currentHeight;
            
        System.out.print(max);
    }
}