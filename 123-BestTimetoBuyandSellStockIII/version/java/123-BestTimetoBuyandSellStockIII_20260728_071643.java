// Last updated: 7/28/2026, 7:16:43 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy1 = Integer.MIN_VALUE, sell1 = 0;
4        int buy2 = Integer.MIN_VALUE, sell2 = 0;
5
6        for (int price : prices) {
7            // First buy: spend money
8            buy1 = Math.max(buy1, -price);
9
10            // First sell: earn money
11            sell1 = Math.max(sell1, buy1 + price);
12
13            // Second buy: spend money again (after first sell)
14            buy2 = Math.max(buy2, sell1 - price);
15
16            // Second sell: earn money again
17            sell2 = Math.max(sell2, buy2 + price);
18        }
19
20        return sell2; // max profit after 2 transactions
21    }
22}
23