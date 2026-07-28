// Last updated: 7/28/2026, 4:03:01 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        // Check each bit position (32 bits for int)
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    sum++;
                }
            }
            // If sum % 3 != 0, this bit belongs to the single number
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
