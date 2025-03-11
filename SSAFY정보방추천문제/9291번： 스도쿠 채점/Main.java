/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 9291                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/9291                           #+#        #+#      #+#    */
/*   Solved: 2025/03/10 17:00:35 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static int[][] sudoku;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
            sudoku = new int[9][9];
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            boolean isCorrect = rows() && cols() && threeBy3();
            sb.append("Case ").append(t).append(": ").append(isCorrect ? "CORRECT" : "INCORRECT").append("\n");

            br.readLine();
        }
        System.out.print(sb);
    }

    static boolean rows() {
        for (int[] row : sudoku) {
            if (!isOneToNine(row))
                return false;
        }
        return true;
    }

    static boolean cols() {
        for (int i = 0; i < 9; i++) {
            int[] tmp = new int[9];
            for (int j = 0; j < 9; j++) {
                tmp[j] = sudoku[j][i];
            }
            if (!isOneToNine(tmp))
                return false;
        }
        return true;
    }

    static boolean threeBy3() {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int[] tmp = new int[9];
                int idx = 0;
                for (int p = 0; p < 3; p++) {
                    for (int q = 0; q < 3; q++) {
                        tmp[idx++] = sudoku[i + p][j + q];
                    }
                }
                if (!isOneToNine(tmp))
                    return false;
            }
        }
        return true;
    }

    static boolean isOneToNine(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num))
                return false;
        }
        return true;
    }
}