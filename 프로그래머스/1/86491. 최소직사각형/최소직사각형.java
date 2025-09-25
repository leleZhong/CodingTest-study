import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int r = 0;
        int c = 0;
        for (int[] arr : sizes) {
            Arrays.sort(arr);
            r = Math.max(r, arr[0]);
            c = Math.max(c, arr[1]);
        }
        
        return r * c;
    }
}