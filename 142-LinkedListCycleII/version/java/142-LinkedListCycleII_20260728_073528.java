// Last updated: 7/28/2026, 7:35:28 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0, right = nums.length - 1;
4
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7
8            if (nums[mid] > nums[right]) {
9                // Minimum is in right half
10                left = mid + 1;
11            } else {
12                // Minimum is in left half (including mid)
13                right = mid;
14            }
15        }
16
17        return nums[left];
18    }
19}
20