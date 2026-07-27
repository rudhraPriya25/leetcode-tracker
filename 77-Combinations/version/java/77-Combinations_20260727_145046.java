// Last updated: 7/27/2026, 2:50:46 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> subsets(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        backtrack(0, nums, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
11        // Add current subset to result
12        result.add(new ArrayList<>(current));
13
14        // Explore further choices
15        for (int i = index; i < nums.length; i++) {
16            current.add(nums[i]);                 // choose nums[i]
17            backtrack(i + 1, nums, current, result); // explore
18            current.remove(current.size() - 1);   // undo choice (backtrack)
19        }
20    }
21}
22