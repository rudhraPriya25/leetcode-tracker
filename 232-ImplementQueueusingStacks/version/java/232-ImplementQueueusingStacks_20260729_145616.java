// Last updated: 7/29/2026, 2:56:16 PM
1import java.util.*;
2
3class Solution {
4    public int[] maxSlidingWindow(int[] nums, int k) {
5        int n = nums.length;
6        int[] result = new int[n - k + 1];
7        Deque<Integer> dq = new LinkedList<>(); // store indices
8
9        for (int i = 0; i < n; i++) {
10            // Step 1: Remove out-of-window indices
11            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
12                dq.pollFirst();
13            }
14
15            // Step 2: Remove smaller elements from back
16            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
17                dq.pollLast();
18            }
19
20            // Step 3: Add current index
21            dq.offerLast(i);
22
23            // Step 4: Record max when window is ready
24            if (i >= k - 1) {
25                result[i - k + 1] = nums[dq.peekFirst()];
26            }
27        }
28
29        return result;
30    }
31}
32