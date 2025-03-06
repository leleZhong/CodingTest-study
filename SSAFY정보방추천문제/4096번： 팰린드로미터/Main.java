/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4096                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4096                           #+#        #+#      #+#    */
/*   Solved: 2025/03/06 21:36:07 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String input = br.readLine();
            if (input.equals("0"))
                break;

            int origin = Integer.parseInt(input);
            int palindrome = find(input.toCharArray());
            sb.append(palindrome - origin).append("\n");
        }
        System.out.print(sb);
    }

    static int find(char[] arr) {
        while (true) {
            if (isPalindrome(arr))
                return Integer.parseInt(new String(arr));
            addOne(arr);
        }
    }

    static boolean isPalindrome(char[] arr) {
        for (int left = 0; left < arr.length / 2; left++) {
            int right = arr.length - 1 - left;
            if (arr[left] != arr[right]) {
                return false;
            }
        }
        return true;
    }

    static void addOne(char[] arr) {
        int carry = 1;
        int len = arr.length;

        for (int i = len - 1; i >= 0; i--) {
            int digit = arr[i] - '0' + carry;
            if (digit == 10) { // 올림 발생
                arr[i] = '0';
                carry = 1;
            } else {
                arr[i] = (char) (digit + '0');
                carry = 0;
                break;
            }
        }
    }
}