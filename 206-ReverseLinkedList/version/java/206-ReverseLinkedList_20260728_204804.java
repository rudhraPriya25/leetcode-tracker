// Last updated: 7/28/2026, 8:48:04 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int n = nums.length;
4        int left = 0;
5        int sum = 0;
6        int minLen = Integer.MAX_VALUE;
7
8        for (int right = 0; right < n; right++) {
9            sum += nums[right];
10
11            // Shrink window while sum ≥ target
12            while (sum >= target) {
13                minLen = Math.min(minLen, right - left + 1);
14                sum -= nums[left];
15                left++;
16            }
17        }
18
19        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
20    }
21}
22