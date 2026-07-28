// Last updated: 7/28/2026, 7:37:38 AM
1class Solution {
2    public int reverseBits(int n) {
3        int result = 0;
4
5        for (int i = 0; i < 32; i++) {
6            int bit = n & 1;          // extract last bit
7            result = (result << 1) | bit; // shift result left and add bit
8            n = n >>> 1;              // unsigned right shift
9        }
10
11        return result;
12    }
13}
14