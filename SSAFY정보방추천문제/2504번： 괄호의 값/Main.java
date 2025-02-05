/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2504                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2504                           #+#        #+#      #+#    */
/*   Solved: 2025/02/05 22:55:16 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[][] brackets = {{'(', ')'}, {'[', ']'}};
        int[] values = {2, 3};

        Stack<Character> bracketStack = new Stack<>();
        int tmp = 1;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char bracket = str.charAt(i);

            for (int j = 0; j < brackets.length; j++) {
                if (bracket == brackets[j][0]) {
                    bracketStack.push(bracket);
                    tmp *= values[j];
                    break;
                }
                else if (bracket == brackets[j][1]) {
                    if (bracketStack.isEmpty() || bracketStack.peek() != brackets[j][0]) {
                        System.out.print(0);
                        return;
                    }
                    else if (str.charAt(i - 1) == brackets[j][0]) {
                        result += tmp;
                    }
                    tmp /= values[j];
                    bracketStack.pop();
                    break;
                }
            }
        }
        System.out.print(!bracketStack.empty() ? 0 : result);
    }
}