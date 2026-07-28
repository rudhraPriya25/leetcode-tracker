// Last updated: 7/28/2026, 9:01:06 PM
1import java.util.*;
2
3class Solution {
4    public List<String> summaryRanges(int[] nums) {
5        List<String> result = new ArrayList<>();
6        if (nums.length == 0) return result;
7
8        int start = nums[0]; // start of current range
9
10        for (int i = 1; i <= nums.length; i++) {
11            // End of range when gap or end of array
12            if (i == nums.length || nums[i] != nums[i-1] + 1) {
13                if (start == nums[i-1]) {
14                    result.add(String.valueOf(start));
15                } else {
16                    result.add(start + "->" + nums[i-1]);
17                }
18                if (i < nums.length) start = nums[i];
19            }
20        }
21
22        return result;
23    }
24}
25