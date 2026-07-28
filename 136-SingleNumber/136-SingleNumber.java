// Last updated: 7/28/2026, 4:03:04 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels duplicates
        }
        return result;
    }
}
