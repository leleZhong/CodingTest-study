import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int[] answer = {};
        for (int i = 3; i * i <= sum; i++) {
            if (sum % i != 0) {
                continue;
            }
            int j = sum / i;
            
            int tmp = 2 * (i + j) - 4;
            if (tmp == brown) {
                answer = new int[] { Math.max(i, j), Math.min(i, j) };;
                break;
            }
        }
        return answer;
    }
}