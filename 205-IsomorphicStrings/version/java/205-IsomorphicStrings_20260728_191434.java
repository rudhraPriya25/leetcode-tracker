// Last updated: 7/28/2026, 7:14:34 PM
1import java.util.*;
2
3class Solution {
4    public boolean isIsomorphic(String s, String t) {
5        if (s.length() != t.length()) return false;
6
7        Map<Character, Character> mapST = new HashMap<>();
8        Map<Character, Character> mapTS = new HashMap<>();
9
10        for (int i = 0; i < s.length(); i++) {
11            char c1 = s.charAt(i);
12            char c2 = t.charAt(i);
13
14            // Check mapping from s → t
15            if (mapST.containsKey(c1)) {
16                if (mapST.get(c1) != c2) return false;
17            } else {
18                mapST.put(c1, c2);
19            }
20
21            // Check mapping from t → s (to avoid two chars mapping to same one)
22            if (mapTS.containsKey(c2)) {
23                if (mapTS.get(c2) != c1) return false;
24            } else {
25                mapTS.put(c2, c1);
26            }
27        }
28
29        return true;
30    }
31}
32