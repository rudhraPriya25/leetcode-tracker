// Last updated: 7/28/2026, 9:14:45 PM
class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

        // Compute prefix function (KMP table)
        int[] lps = new int[combined.length()];
        for (int i = 1; i < combined.length(); i++) {
            int j = lps[i - 1];
            while (j > 0 && combined.charAt(i) != combined.charAt(j)) {
                j = lps[j - 1];
            }
            if (combined.charAt(i) == combined.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }

        // lps[last] gives length of longest palindrome prefix
        int longestPrefix = lps[combined.length() - 1];
        String suffix = s.substring(longestPrefix);
        String prefixToAdd = new StringBuilder(suffix).reverse().toString();

        return prefixToAdd + s;
    }
}
