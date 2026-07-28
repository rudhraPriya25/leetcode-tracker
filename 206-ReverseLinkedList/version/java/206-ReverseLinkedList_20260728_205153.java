// Last updated: 7/28/2026, 8:51:53 PM
1class Solution {
2    public String shortestPalindrome(String s) {
3        String rev = new StringBuilder(s).reverse().toString();
4        String combined = s + "#" + rev;
5
6        // Compute prefix function (KMP table)
7        int[] lps = new int[combined.length()];
8        for (int i = 1; i < combined.length(); i++) {
9            int j = lps[i - 1];
10            while (j > 0 && combined.charAt(i) != combined.charAt(j)) {
11                j = lps[j - 1];
12            }
13            if (combined.charAt(i) == combined.charAt(j)) {
14                j++;
15            }
16            lps[i] = j;
17        }
18
19        // lps[last] gives length of longest palindrome prefix
20        int longestPrefix = lps[combined.length() - 1];
21        String suffix = s.substring(longestPrefix);
22        String prefixToAdd = new StringBuilder(suffix).reverse().toString();
23
24        return prefixToAdd + s;
25    }
26}
27