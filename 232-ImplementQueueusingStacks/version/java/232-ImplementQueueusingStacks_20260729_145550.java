// Last updated: 7/29/2026, 2:55:50 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] answer = new int[n];
5
6        // Step 1: Prefix products
7        answer[0] = 1;
8        for (int i = 1; i < n; i++) {
9            answer[i] = answer[i - 1] * nums[i - 1];
10        }
11
12        // Step 2: Suffix products (multiply directly into answer)
13        int suffix = 1;
14        for (int i = n - 1; i >= 0; i--) {
15            answer[i] *= suffix;
16            suffix *= nums[i];
17        }
18
19        return answer;
20    }
21}
22