// Last updated: 7/28/2026, 4:05:37 PM
import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
        // Base case: if combination size == k
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try each number from 'start' to 'n'
        for (int i = start; i <= n; i++) {
            current.add(i);              // choose i
            backtrack(i + 1, n, k, current, result); // explore further
            current.remove(current.size() - 1); // undo choice (backtrack)
        }
    }
}
