/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 9012                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/9012                           #+#        #+#      #+#    */
/*   Solved: 2025/03/09 19:22:28 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        char[] bracket = {'(', ')'};

        for (int tc = 0; tc < t; tc++) {
            String input = br.readLine();
            int num = 0;
            boolean isValid = true;
            for (int i = 0; i < input.length(); i++) {
                char tmp = input.charAt(i);
                if (tmp == bracket[0]) 
                    num++;
                else if (tmp == bracket[1]) {
                    if (num <= 0) {
                        isValid = false;
                        break;
                    }
                    num--;
                }
            }
            if (num != 0)
                isValid = false;
            sb.append(isValid ? "YES":"NO").append("\n");
        }
        System.out.print(sb);
    }
}