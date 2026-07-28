// Last updated: 7/28/2026, 9:14:38 PM
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int k, int n, int start) {
        // Base case: if combination size == k and sum == n
        if (current.size() == k && n == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Stop if invalid
        if (current.size() > k || n < 0) return;

        // Try numbers from 'start' to 9
        for (int i = start; i <= 9; i++) {
            current.add(i); // choose i
            backtrack(result, current, k, n - i, i + 1); // explore further
            current.remove(current.size() - 1); // undo choice (backtrack)
        }
    }
}
