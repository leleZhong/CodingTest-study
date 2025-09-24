import java.util.*;

class Solution {
    boolean solution(String s) {
        char[] arr = s.toCharArray();
        
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : arr) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.poll();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}