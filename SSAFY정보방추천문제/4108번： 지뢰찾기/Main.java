/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4108                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4108                           #+#        #+#      #+#    */
/*   Solved: 2025/02/24 19:03:00 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] area;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (r == 0 && c == 0) break;

            area = new char[r + 2][c + 2];
            for (int i = 1; i <= r; i++) {
                String line = br.readLine();
                for (int j = 1; j <= c; j++) {
                    area[i][j] = line.charAt(j - 1);
                }
            }
            
            for (int i = 1; i <= r; i++) {
                for (int j = 1; j <= c; j++) {
                    if (area[i][j] == '.')
                        mineswipper(i, j);
                    sb.append(area[i][j]);
                }
                sb.append("\n");
            }
            System.out.print(sb);
            sb.setLength(0);    // StringBuilder ÃÊ±âÈ­
        }
    }
    
    static void mineswipper(int r, int c) {
        int cnt = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (area[r + i][c + j] == '*')
                    cnt++;
            }
        }
        area[r][c] = (char)(cnt + '0');
    }
}