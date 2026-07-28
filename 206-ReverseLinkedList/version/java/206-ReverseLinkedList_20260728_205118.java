// Last updated: 7/28/2026, 8:51:18 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        if (n == 1) return nums[0];
5        if (n == 2) return Math.max(nums[0], nums[1]);
6
7        // Case 1: Exclude last house
8        int case1 = robLinear(nums, 0, n - 2);
9        // Case 2: Exclude first house
10        int case2 = robLinear(nums, 1, n - 1);
11
12        return Math.max(case1, case2);
13    }
14
15    private int robLinear(int[] nums, int start, int end) {
16        int prev2 = 0, prev1 = 0;
17        for (int i = start; i <= end; i++) {
18            int curr = Math.max(prev1, prev2 + nums[i]);
19            prev2 = prev1;
20            prev1 = curr;
21        }
22        return prev1;
23    }
24}
25