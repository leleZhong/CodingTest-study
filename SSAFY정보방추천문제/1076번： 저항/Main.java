/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1076                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1076                           #+#        #+#      #+#    */
/*   Solved: 2025/01/31 18:28:29 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();

        List<String> colors = Arrays.asList(new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"});
        long[] multipl = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        long answer = (colors.indexOf(first) * 10 + colors.indexOf(second)) * multipl[colors.indexOf(third)];
        System.out.print(answer);
    }
}