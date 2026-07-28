// Last updated: 7/28/2026, 4:01:58 PM
class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0;

        // If k >= n/2, it's equivalent to unlimited transactions (like Problem 122)
        if (k >= n / 2) {
            int profit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;
        }

        // DP arrays
        int[][] dp = new int[k + 1][n];

        // dp[t][i] = max profit up to day i with at most t transactions
        for (int t = 1; t <= k; t++) {
            int maxDiff = -prices[0]; // best balance of (profit - price)
            for (int i = 1; i < n; i++) {
                dp[t][i] = Math.max(dp[t][i - 1], prices[i] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[t - 1][i] - prices[i]);
            }
        }

        return dp[k][n - 1];
    }
}
