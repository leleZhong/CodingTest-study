/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1259                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1259                           #+#        #+#      #+#    */
/*   Solved: 2025/01/26 16:05:39 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tc = br.readLine();
        while (!tc.equals("0")) {
            if (tc.length() == 1) {
                System.out.println("yes");
            }
            else {
                String str1 = tc.substring(0, tc.length()/2);
                String str2 = tc.substring((tc.length()-1)/2+1);

                String reverseStr = new StringBuilder(str2).reverse().toString();
                if (str1.equals(reverseStr))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            tc = br.readLine();
        }
    }
}

// 문자열 길이가 짝/홀일 때 어떻게 나누는지?
// 문자열을 뒤집는 방법법
// reverse를 사용하기 위해 StringBuilder, StringBuffer 둘 중 왜 StringBuilder를 썼는지?
// 다른 사람 풀이 : flag 사용, for문 chatAt()으로 문자끼리 직접 비교 --> 더 단순함함
// 문자열 절반을 잘라내고 StringBuilder로 뒤집는 작업은 불필요한 객체 생성과 메모리 사용을 증가