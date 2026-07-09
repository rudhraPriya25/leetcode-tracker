// Last updated: 7/9/2026, 10:24:05 AM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0; // even index
        int j = 1; // odd index
        int n = nums.length;

        while (i < n && j < n) {
            if (nums[i] % 2 == 0) {
                i += 2; // correct placement, move to next even index
            } else if (nums[j] % 2 == 1) {
                j += 2; // correct placement, move to next odd index
            } else {
                // swap when misplaced
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 2;
                j += 2;
            }
        }

        return nums;
    }
}
