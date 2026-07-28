// Last updated: 7/28/2026, 4:01:55 PM
class Solution {
    public int reverseBits(int n) {
        int result = 0;

        // Process all 32 bits
        for (int i = 0; i < 32; i++) {
            int bit = n & 1;               // extract the last bit
            result = (result << 1) | bit;  // shift result left and add bit
            n = n >>> 1;                   // unsigned right shift
        }

        return result;
    }
}
