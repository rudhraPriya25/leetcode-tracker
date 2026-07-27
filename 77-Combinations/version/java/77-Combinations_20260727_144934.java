// Last updated: 7/27/2026, 2:49:34 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combine(int n, int k) {
5        List<List<Integer>> result = new ArrayList<>();
6        backtrack(1, n, k, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
11        // Base case: if combination size == k
12        if (current.size() == k) {
13            result.add(new ArrayList<>(current));
14            return;
15        }
16
17        // Try each number from 'start' to 'n'
18        for (int i = start; i <= n; i++) {
19            current.add(i);              // choose i
20            backtrack(i + 1, n, k, current, result); // explore further
21            current.remove(current.size() - 1); // undo choice (backtrack)
22        }
23    }
24}
25