/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 15686                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/15686                          #+#        #+#      #+#    */
/*   Solved: 2025/02/22 19:46:59 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] city;
    static List<int[]> houseList = new ArrayList<>();
    static List<int[]> chickenList = new ArrayList<>();
    static List<int[]> selectList = new ArrayList<>();
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        city = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                city[i][j] = Integer.parseInt(st.nextToken());
                if (city[i][j] == 1){
                    houseList.add(new int[]{i, j});
                } else if (city[i][j] == 2) {
                    chickenList.add(new int[]{i, j});
                }
            }
        }
        selectChicken(0);
        System.out.print(ans);
    }

    static void selectChicken(int start) {
        if (selectList.size() == m) {
            updateAnswer(selectList);
            return;
        }

        for (int i = start; i < chickenList.size(); i++) {
            selectList.add(chickenList.get(i));
            selectChicken(i + 1);
            selectList.remove(selectList.size() - 1);
        }
    }

    static void updateAnswer(List<int[]> selected) {
        int tmp = 0;
        int minDis, distance;
        for (int i = 0; i < houseList.size(); i++) {
            minDis = Integer.MAX_VALUE;
            for (int j = 0; j < selected.size(); j++) {
                distance = Math.abs(houseList.get(i)[0] - selected.get(j)[0]) + Math.abs(houseList.get(i)[1] - selected.get(j)[1]);
                if (distance < minDis)
                    minDis = distance;
            }
            tmp += minDis;
        }
        
        if (tmp < ans)
            ans = tmp;
    }
}