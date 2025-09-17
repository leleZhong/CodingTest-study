import java.util.*;

class Solution {
    static char[] arr;
    static int len;
    static HashSet<Integer> set;
    static boolean[] visited;
    
    public int solution(String numbers) {
        arr = numbers.toCharArray();
        len = numbers.length();
        set = new HashSet<>();
        visited = new boolean[len];
        
        dfs(0, "");
        
        int answer = 0;
        for (int num : set) {
            boolean find = true;
            if (num == 0 || num == 1) {
                continue;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    find = false;
                    break;
                }
            }
            if (find) {
                answer++;
            }
        }
        return answer;
    }
    
    static void dfs(int depth, String current) {
        if (depth == len + 1) {
            return;
        }
        
        if (!current.isEmpty()) {
            int num = Integer.parseInt(current);
            set.add(num);
        }
        
        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, current + arr[i]);
                visited[i] = false;
            }
        }
    }
}