// Last updated: 7/28/2026, 7:34:33 AM
1class Solution {
2    public String reverseWords(String s) {
3        // Step 1: Trim and split
4        String[] words = s.trim().split("\\s+"); // split by one or more spaces
5
6        // Step 2: Reverse
7        StringBuilder sb = new StringBuilder();
8        for (int i = words.length - 1; i >= 0; i--) {
9            sb.append(words[i]);
10            if (i > 0) sb.append(" ");
11        }
12
13        return sb.toString();
14    }
15}
16