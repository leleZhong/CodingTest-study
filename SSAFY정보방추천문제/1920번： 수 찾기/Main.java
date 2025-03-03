/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1920                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1920                           #+#        #+#      #+#    */
/*   Solved: 2025/03/03 17:49:34 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb;
    static long[] arrA;
    static long b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arrA = new long[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arrA);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b = Long.parseLong(st.nextToken());
            boolean find = findB(0, n - 1);
            if (!find)
                sb.append(0).append("\n");
        }
        System.out.print(sb);
    }

    static boolean findB(int start, int end) {
        if (start > end)
            return false;
        
        int mid = (start + end) / 2;
        if (b == arrA[mid]) {
            sb.append(1).append("\n");
            return true;
        }
        else if (b < arrA[mid])
            return findB(start, mid - 1);
        else
            return findB(mid + 1, end);
    }
}