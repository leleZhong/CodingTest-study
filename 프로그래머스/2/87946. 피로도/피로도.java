import java.util.*;

class Solution {
    static int[][] arr;
    static boolean[] visited;
    static int len = 0;
    static int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        len = dungeons.length;
        arr = dungeons;
        visited = new boolean[len];
        
        recur(0, k);
        
        return max;
    }
    
    static void recur(int depth, int remain) {
        max = Math.max(max, depth);
        
        for (int i = 0; i < len; i++) {
            if (!visited[i] && remain >= arr[i][0]) {
                visited[i] = true;
                recur(depth + 1, remain - arr[i][1]);
                visited[i] = false;
            }
        }
    }
}