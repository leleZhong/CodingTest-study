/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2309                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2309                           #+#        #+#      #+#    */
/*   Solved: 2025/02/14 23:00:57 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9];
        int sum = 0;
        for (int i = 0; i < dwarf.length; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }

        int notSeven = sum - 100;
        boolean found = false;

        for (int i = 0; i < dwarf.length; i++) {
            for (int j = i + 1; j < dwarf.length; j++) {
                if (dwarf[i] + dwarf[j] == notSeven) {
                    dwarf[i] = 0;
                    dwarf[j] = 0;
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        Arrays.sort(dwarf);
        for (int i = 2; i < dwarf.length; i++) {
            System.out.println(dwarf[i]);
        }
    }
}