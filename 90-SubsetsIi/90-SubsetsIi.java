// Last updated: 7/28/2026, 4:05:08 PM
import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // sort to handle duplicates
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            // Skip duplicates
            if (i > index && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);
            backtrack(i + 1, nums, current, result);
            current.remove(current.size() - 1); // backtrack
        }
    }
}
