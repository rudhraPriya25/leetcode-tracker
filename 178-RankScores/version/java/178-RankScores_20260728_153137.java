// Last updated: 7/28/2026, 3:31:37 PM
1import java.util.*;
2
3class Solution {
4    public String largestNumber(int[] nums) {
5        // Step 1: Convert numbers to strings
6        String[] arr = new String[nums.length];
7        for (int i = 0; i < nums.length; i++) {
8            arr[i] = String.valueOf(nums[i]);
9        }
10
11        // Step 2: Sort using custom comparator
12        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
13
14        // Step 3: Handle edge case (all zeros)
15        if (arr[0].equals("0")) {
16            return "0";
17        }
18
19        // Step 4: Build the result string
20        StringBuilder sb = new StringBuilder();
21        for (String s : arr) {
22            sb.append(s);
23        }
24
25        return sb.toString();
26    }
27}
28