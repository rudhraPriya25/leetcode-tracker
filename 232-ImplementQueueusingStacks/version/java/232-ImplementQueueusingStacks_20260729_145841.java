// Last updated: 7/29/2026, 2:58:41 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> diffWaysToCompute(String expression) {
5        List<Integer> result = new ArrayList<>();
6
7        for (int i = 0; i < expression.length(); i++) {
8            char c = expression.charAt(i);
9
10            if (c == '+' || c == '-' || c == '*') {
11                // Split into left and right
12                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
13                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
14
15                // Combine results
16                for (int l : left) {
17                    for (int r : right) {
18                        if (c == '+') result.add(l + r);
19                        else if (c == '-') result.add(l - r);
20                        else if (c == '*') result.add(l * r);
21                    }
22                }
23            }
24        }
25
26        // Base case: pure number
27        if (result.isEmpty()) {
28            result.add(Integer.parseInt(expression));
29        }
30
31        return result;
32    }
33}
34