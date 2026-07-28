// Last updated: 7/28/2026, 4:03:42 PM
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1]; // take profit
            }
        }

        return profit;
    }
}
