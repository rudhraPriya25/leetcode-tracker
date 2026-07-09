// Last updated: 7/9/2026, 10:24:12 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
