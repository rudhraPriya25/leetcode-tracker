// Last updated: 7/28/2026, 4:02:19 PM
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1; // minimum is in right half
            } else if (nums[mid] < nums[right]) {
                right = mid; // minimum is in left half
            } else {
                right--; // handle duplicates
            }
        }

        return nums[left];
    }
}
