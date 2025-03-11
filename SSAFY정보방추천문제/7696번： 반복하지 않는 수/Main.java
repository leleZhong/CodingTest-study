/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 7696                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/7696                           #+#        #+#      #+#    */
/*   Solved: 2025/03/10 20:24:48 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] nums = new int[1000001];
        int cnt = 0;
        for (int i = 1; cnt < 1000000; i++) {
            if (isUnique(i)) {
                cnt++;
                nums[cnt] = i;
            }
        }

        String n;
        int target;
        while (true) {
            n = br.readLine();
            if (n.equals("0"))
                break;

            target = Integer.parseInt(n);
            sb.append(nums[target]).append("\n");
        }
        System.out.print(sb);
    }

    static boolean isUnique(int num) {
        int used = 0;
        int tmp;
        while (num > 0) {
            tmp = num % 10;
            if ((used & (1 << tmp)) != 0)
                return false;
            used |= (1 << tmp);
            num /= 10;
        }
        return true;
    }
}