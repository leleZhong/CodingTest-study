import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        PriorityQueue<Integer> priority = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] { priorities[i], i });
            priority.add(priorities[i]);
        }
        
        int answer = 1;
        while (!queue.isEmpty()) {
            if (queue.peek()[0] == priority.peek()) {
                int[] arr = queue.poll();
                if (arr[1] == location) {
                    break;
                }
                priority.poll();
                answer++;
            } else {
                queue.add(queue.poll());
            }
        }
        return answer;
    }
}