// Last updated: 7/27/2026, 2:49:03 PM
1import java.util.*;
2
3class Solution {
4    public String minWindow(String s, String t) {
5        if (s.length() < t.length()) return "";
6
7        // Step 1: Count characters in t
8        Map<Character, Integer> need = new HashMap<>();
9        for (char c : t.toCharArray()) {
10            need.put(c, need.getOrDefault(c, 0) + 1);
11        }
12
13        Map<Character, Integer> window = new HashMap<>();
14        int have = 0, needCount = need.size();
15        int left = 0, minLen = Integer.MAX_VALUE;
16        int minStart = 0;
17
18        // Step 2: Expand window
19        for (int right = 0; right < s.length(); right++) {
20            char c = s.charAt(right);
21            window.put(c, window.getOrDefault(c, 0) + 1);
22
23            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) {
24                have++;
25            }
26
27            // Step 3: Shrink window
28            while (have == needCount) {
29                if (right - left + 1 < minLen) {
30                    minLen = right - left + 1;
31                    minStart = left;
32                }
33
34                char leftChar = s.charAt(left);
35                window.put(leftChar, window.get(leftChar) - 1);
36                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
37                    have--;
38                }
39                left++;
40            }
41        }
42
43        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
44    }
45}
46