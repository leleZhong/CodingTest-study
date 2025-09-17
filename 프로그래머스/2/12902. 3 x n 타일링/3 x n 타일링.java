class Solution {
    public int solution(int n) {
        if (n % 2 != 0) {
            return 0;
        }
        
        long[] dp = new long[n + 1];
        dp[2] = 3;
        dp[4] = 11;
        for (int i = 6; i <= n; i += 2) {
            long sum = 0;
            for (int j = 2; j <= i - 4; j += 2) {
                sum += dp[j];
                sum %= 1000000007;
            }
            dp[i] = dp[i - 2] * 3 % 1000000007 + sum * 2 % 1000000007 + 2;
            dp[i] %= 1000000007;
        }
            
        return (int) dp[n];
    }
}