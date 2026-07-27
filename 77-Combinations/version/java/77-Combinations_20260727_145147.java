// Last updated: 7/27/2026, 2:51:47 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i = 0; // pointer for placement
4
5        for (int num : nums) {
6            // Allow first two occurrences OR new unique element
7            if (i < 2 || num != nums[i - 2]) {
8                nums[i] = num;
9                i++;
10            }
11        }
12        return i; // new length
13    }
14}
15