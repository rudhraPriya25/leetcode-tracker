// Last updated: 7/28/2026, 4:03:38 PM
class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE, sell1 = 0;
        int buy2 = Integer.MIN_VALUE, sell2 = 0;

        for (int price : prices) {
            // First buy: spend money
            buy1 = Math.max(buy1, -price);

            // First sell: earn money
            sell1 = Math.max(sell1, buy1 + price);

            // Second buy: spend money again (after first sell)
            buy2 = Math.max(buy2, sell1 - price);

            // Second sell: earn money again
            sell2 = Math.max(sell2, buy2 + price);
        }

        return sell2; // max profit after 2 transactions
    }
}
