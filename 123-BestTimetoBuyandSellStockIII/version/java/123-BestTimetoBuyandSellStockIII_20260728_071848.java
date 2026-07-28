// Last updated: 7/28/2026, 7:18:48 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        // Step 1: Clean string (keep only alphanumeric, lowercase)
4        StringBuilder cleaned = new StringBuilder();
5        for (char c : s.toCharArray()) {
6            if (Character.isLetterOrDigit(c)) {
7                cleaned.append(Character.toLowerCase(c));
8            }
9        }
10
11        // Step 2: Reverse and compare
12        String str = cleaned.toString();
13        String rev = cleaned.reverse().toString();
14
15        return str.equals(rev);
16    }
17}
18