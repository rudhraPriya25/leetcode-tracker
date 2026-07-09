// Last updated: 7/9/2026, 10:25:03 AM
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // No carry needed
                return digits;
            }
            digits[i] = 0;     // Set to 0 and carry over
        }

        // If all digits were 9, we need an extra digit
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
