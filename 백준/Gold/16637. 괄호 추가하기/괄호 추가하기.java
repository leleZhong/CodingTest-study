import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int N;
    static int len;
    static char[] operator;
    static int[] nums;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        len = N / 2;
        operator = new char[len];
        nums = new int[len + 1];

        String s = br.readLine();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                nums[i / 2] = s.charAt(i) - '0';
            } else {
                operator[i / 2] = s.charAt(i);
            }
        }

        dfs(0, nums[0]);

        System.out.println(max);
    }

    static void dfs(int idx, int value) {
        if (idx == len) {
            max = Math.max(max, value);
            return;
        }

        // 괄호 ㄴㄴ
        int next = calc(value, nums[idx + 1], operator[idx]);
        dfs(idx + 1, next);
        // 괄호 ㅇㅇ
        if (idx + 1 < len) {
            int bracket = calc(nums[idx + 1], nums[idx + 2], operator[idx + 1]);
            next = calc(value, bracket, operator[idx]);
            dfs(idx + 2, next);
        }
    }

    static int calc(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
        }
        return 0;
    }
}