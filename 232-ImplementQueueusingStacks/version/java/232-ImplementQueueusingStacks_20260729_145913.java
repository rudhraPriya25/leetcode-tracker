// Last updated: 7/29/2026, 2:59:13 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) return false;
4
5        int[] count = new int[26]; // only lowercase letters
6
7        for (char c : s.toCharArray()) {
8            count[c - 'a']++;
9        }
10        for (char c : t.toCharArray()) {
11            count[c - 'a']--;
12        }
13
14        for (int val : count) {
15            if (val != 0) return false;
16        }
17        return true;
18    }
19}
20