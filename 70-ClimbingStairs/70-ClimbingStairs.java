// Last updated: 7/9/2026, 10:24:58 AM
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        System.out.println(sol.climbStairs(2)); // Output: 2
        System.out.println(sol.climbStairs(3)); // Output: 3
        System.out.println(sol.climbStairs(5)); // Output: 8
    }
}

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;  // Base cases

        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
