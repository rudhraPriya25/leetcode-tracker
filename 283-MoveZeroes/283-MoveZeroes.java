// Last updated: 7/9/2026, 10:24:13 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;  // position for next non-zero

        // Step 1: move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[pos++] = num;
            }
        }

        // Step 2: fill remaining positions with zeros
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }
}
