// Last updated: 7/28/2026, 4:03:44 PM
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update minimum
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // check profit
            }
        }

        return maxProfit;
    }
}
