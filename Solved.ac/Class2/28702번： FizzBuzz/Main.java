/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 28702                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/28702                          #+#        #+#      #+#    */
/*   Solved: 2025/01/27 20:29:21 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        for (int i = 1; i <= 3; i++) {
            String str = br.readLine();
            if (str.contains("Fizz") || str.contains("Buzz"))
                continue;
            num = Integer.parseInt(str) + (3 - i + 1);
        }
        if (num % 15 == 0)
            System.out.println("FizzBuzz");
        else if (num % 3== 0 && !(num % 5 == 0))
            System.out.println("Fizz");
        else if (!(num % 3 == 0) && num % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(num);
    }
}