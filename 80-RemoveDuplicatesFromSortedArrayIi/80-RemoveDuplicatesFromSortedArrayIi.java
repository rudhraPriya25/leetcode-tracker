// Last updated: 7/28/2026, 4:05:29 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // pointer for placement

        for (int num : nums) {
            // Allow first two occurrences OR new unique element
            if (i < 2 || num != nums[i - 2]) {
                nums[i] = num;
                i++;
            }
        }
        return i; // new length
    }
}
