// Last updated: 7/27/2026, 3:01:28 PM
1class Solution {
2    public int numDecodings(String s) {
3        if (s == null || s.length() == 0) return 0;
4
5        int n = s.length();
6        int[] dp = new int[n + 1];
7        dp[0] = 1; // empty string
8        dp[1] = s.charAt(0) != '0' ? 1 : 0;
9
10        for (int i = 2; i <= n; i++) {
11            // Single digit decode
12            if (s.charAt(i - 1) != '0') {
13                dp[i] += dp[i - 1];
14            }
15            // Two digit decode
16            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
17            if (twoDigit >= 10 && twoDigit <= 26) {
18                dp[i] += dp[i - 2];
19            }
20        }
21
22        return dp[n];
23    }
24}
25