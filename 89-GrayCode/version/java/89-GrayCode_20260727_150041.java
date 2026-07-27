// Last updated: 7/27/2026, 3:00:41 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> subsetsWithDup(int[] nums) {
5        Arrays.sort(nums); // sort to handle duplicates
6        List<List<Integer>> result = new ArrayList<>();
7        backtrack(0, nums, new ArrayList<>(), result);
8        return result;
9    }
10
11    private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
12        result.add(new ArrayList<>(current));
13
14        for (int i = index; i < nums.length; i++) {
15            // Skip duplicates
16            if (i > index && nums[i] == nums[i - 1]) continue;
17
18            current.add(nums[i]);
19            backtrack(i + 1, nums, current, result);
20            current.remove(current.size() - 1); // backtrack
21        }
22    }
23}
24