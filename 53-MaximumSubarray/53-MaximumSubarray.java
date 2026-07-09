// Last updated: 7/9/2026, 10:25:23 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];   // Start with the first element
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray OR start a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
