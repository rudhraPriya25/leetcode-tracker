// Last updated: 7/28/2026, 7:38:03 AM
1class Solution {
2    public int hammingWeight(int n) {
3        int count = 0;
4        while (n != 0) {
5            count += (n & 1); // check last bit
6            n >>>= 1;         // unsigned right shift
7        }
8        return count;
9    }
10}
11