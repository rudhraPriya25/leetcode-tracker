// Last updated: 7/28/2026, 7:42:44 AM
1class Solution {
2    public int rangeBitwiseAnd(int left, int right) {
3        int shift = 0;
4        while (left < right) {
5            left >>= 1;
6            right >>= 1;
7            shift++;
8        }
9        return left << shift;
10    }
11}
12