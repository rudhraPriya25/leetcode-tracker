// Last updated: 7/28/2026, 4:02:01 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1); // check last bit
            n >>>= 1;         // unsigned right shift
        }
        return count;
    }
}
