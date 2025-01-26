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

// ���ڿ� ���̰� ¦/Ȧ�� �� ��� ��������?
// ���ڿ��� ������ �����
// reverse�� ����ϱ� ���� StringBuilder, StringBuffer �� �� �� StringBuilder�� �����?
// �ٸ� ��� Ǯ�� : flag ���, for�� chatAt()���� ���ڳ��� ���� �� --> �� �ܼ�����
// ���ڿ� ������ �߶󳻰� StringBuilder�� ������ �۾��� ���ʿ��� ��ü ������ �޸� ����� ����