// Last updated: 7/27/2026, 3:05:45 PM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int m = s1.length(), n = s2.length();
4        if (m + n != s3.length()) return false;
5
6        boolean[][] dp = new boolean[m + 1][n + 1];
7        dp[0][0] = true;
8
9        for (int i = 0; i <= m; i++) {
10            for (int j = 0; j <= n; j++) {
11                if (i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
12                    dp[i][j] = dp[i][j] || dp[i - 1][j];
13                }
14                if (j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
15                    dp[i][j] = dp[i][j] || dp[i][j - 1];
16                }
17            }
18        }
19
20        return dp[m][n];
21    }
22}
23