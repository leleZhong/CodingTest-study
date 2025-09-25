import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (arr1[i % 5] == answers[i]) {
                score[0]++;
            }
            if (arr2[i % 8] == answers[i]) {
                score[1]++;
            }
            if (arr3[i % 10] == answers[i]) {
                score[2]++;
            }
        }
        
        int max = 0;
        for (int num : score) {
            max = Math.max(max, num);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (max == score[i]) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}