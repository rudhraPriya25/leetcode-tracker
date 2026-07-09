// Last updated: 7/9/2026, 10:23:44 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;

        // Process each digit
        while (n > 0) {
            int digit = n % 10;   // extract last digit
            digitSum += digit;    // add to digit sum
            squareSum += digit * digit; // add square of digit
            n /= 10;              // remove last digit
        }

        // Check condition
        return (squareSum - digitSum) >= 50;
    }
}
