class Solution {
    public int solution(int n) {
        if (n % 2 != 0) {
            return 0;
        }
        
        long[] dp = new long[n + 1];
        long sum = 0;
        dp[2] = 3;
        for (int i = 4; i <= n; i += 2) {
            dp[i] = dp[i - 2] * 3 % 1000000007 + sum * 2 % 1000000007 + 2;
            sum += dp[i - 2];
            dp[i] %= 1000000007;
        }
            
        return (int) dp[n];
    }
}