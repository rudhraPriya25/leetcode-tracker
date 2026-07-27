// Last updated: 7/27/2026, 3:03:07 PM
1import java.util.*;
2
3class Solution {
4    public List<String> restoreIpAddresses(String s) {
5        List<String> result = new ArrayList<>();
6        backtrack(s, 0, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void backtrack(String s, int index, List<String> parts, List<String> result) {
11        // Base case: 4 parts formed
12        if (parts.size() == 4) {
13            if (index == s.length()) {
14                result.add(String.join(".", parts));
15            }
16            return;
17        }
18
19        // Try parts of length 1 to 3
20        for (int len = 1; len <= 3; len++) {
21            if (index + len > s.length()) break;
22
23            String part = s.substring(index, index + len);
24
25            // Validate part
26            if ((part.startsWith("0") && part.length() > 1) || Integer.parseInt(part) > 255) {
27                continue;
28            }
29
30            parts.add(part);
31            backtrack(s, index + len, parts, result);
32            parts.remove(parts.size() - 1); // backtrack
33        }
34    }
35}
36