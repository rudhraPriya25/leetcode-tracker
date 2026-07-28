// Last updated: 7/28/2026, 4:05:34 PM
import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Add current subset to result
        result.add(new ArrayList<>(current));

        // Explore further choices
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);                 // choose nums[i]
            backtrack(i + 1, nums, current, result); // explore
            current.remove(current.size() - 1);   // undo choice (backtrack)
        }
    }
}
