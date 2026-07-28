// Last updated: 7/28/2026, 7:35:00 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int maxProd = nums[0];
4        int minProd = nums[0];
5        int result = nums[0];
6
7        for (int i = 1; i < nums.length; i++) {
8            int curr = nums[i];
9
10            // Swap if current number is negative
11            if (curr < 0) {
12                int temp = maxProd;
13                maxProd = minProd;
14                minProd = temp;
15            }
16
17            // Update max/min product ending at current index
18            maxProd = Math.max(curr, maxProd * curr);
19            minProd = Math.min(curr, minProd * curr);
20
21            // Update global result
22            result = Math.max(result, maxProd);
23        }
24
25        return result;
26    }
27}
28