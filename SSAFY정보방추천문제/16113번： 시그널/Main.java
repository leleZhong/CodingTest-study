/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 16113                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/16113                          #+#        #+#      #+#    */
/*   Solved: 2025/02/04 20:46:48 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String signal = br.readLine();

        arr = new char[5][n / 5 + 2]; // 마지막 숫자가 1일 경우 대비 
        for (int i = 0; i < n; i++) {
            arr[i / (n / 5)][i % (n / 5)] = signal.charAt(i);
        }

        int idx = 0;
        while (idx < n / 5) {
            int num = decode(idx);

            if (num == -1)
                idx++;
            else {
                sb.append(num);
            
                if (num == 1)
                    idx += 2;
                else
                    idx += 3;
            }
        }

        System.out.print(sb);
    }

    public static int decode(int idx) {
        if (arr[0][idx] == '.')
            return -1;
        
        outerLoop:
        for (int i = 0; i < numbers.length; i++) {
            if (i == 1)
                continue;
            
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (arr[j][idx + k] != numbers[i][j].charAt(k))
                            continue outerLoop;
                    }
                }
            return i;
        }
        return 1;
    }

    static String[][] numbers = {
        {
            "###",
            "#.#",
            "#.#",
            "#.#",
            "###"
        },
        {
            // 따로 처리
        },
        {
            "###",
            "..#",
            "###",
            "#..",
            "###"
        },
        {
            "###",
            "..#",
            "###",
            "..#",
            "###"
        },
        {
            "#.#",
            "#.#",
            "###",
            "..#",
            "..#"
        },
        {
            "###",
            "#..",
            "###",
            "..#",
            "###"
        },
        {
            "###",
            "#..",
            "###",
            "#.#",
            "###"
        },
        {
            "###",
            "..#",
            "..#",
            "..#",
            "..#"
        },
        {
            "###",
            "#.#",
            "###",
            "#.#",
            "###"
        },
        {
            "###",
            "#.#",
            "###",
            "..#",
            "###"
        }
    };
}