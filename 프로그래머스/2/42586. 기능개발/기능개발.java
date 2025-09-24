import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = progresses.length;
        int days = 0;
        
        int idx = 0;
        while (idx < len) {
            int ans = 0;
            int tmp = (100 - progresses[idx]) / speeds[idx];
            days = ((100 - progresses[idx]) % speeds[idx]) != 0 ? tmp + 1 : tmp;
            
            while (idx < len && (progresses[idx] + speeds[idx] * days) >= 100) {
                idx++;
                ans++;
            }
            
            list.add(ans);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}