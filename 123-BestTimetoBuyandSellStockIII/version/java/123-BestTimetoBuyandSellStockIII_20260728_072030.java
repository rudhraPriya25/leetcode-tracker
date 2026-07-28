// Last updated: 7/28/2026, 7:20:30 AM
1import java.util.*;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5        Set<Integer> set = new HashSet<>();
6        for (int num : nums) {
7            set.add(num);
8        }
9
10        int longest = 0;
11
12        for (int num : set) {
13            // Only start if it's the beginning of a sequence
14            if (!set.contains(num - 1)) {
15                int currentNum = num;
16                int length = 1;
17
18                while (set.contains(currentNum + 1)) {
19                    currentNum++;
20                    length++;
21                }
22
23                longest = Math.max(longest, length);
24            }
25        }
26
27        return longest;
28    }
29}
30