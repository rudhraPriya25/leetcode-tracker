// Last updated: 7/28/2026, 9:01:21 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> majorityElement(int[] nums) {
5        int cand1 = 0, cand2 = 0;
6        int count1 = 0, count2 = 0;
7
8        // Step 1: Find potential candidates
9        for (int num : nums) {
10            if (num == cand1) {
11                count1++;
12            } else if (num == cand2) {
13                count2++;
14            } else if (count1 == 0) {
15                cand1 = num;
16                count1 = 1;
17            } else if (count2 == 0) {
18                cand2 = num;
19                count2 = 1;
20            } else {
21                count1--;
22                count2--;
23            }
24        }
25
26        // Step 2: Verify candidates
27        count1 = 0;
28        count2 = 0;
29        for (int num : nums) {
30            if (num == cand1) count1++;
31            else if (num == cand2) count2++;
32        }
33
34        List<Integer> result = new ArrayList<>();
35        int n = nums.length;
36        if (count1 > n / 3) result.add(cand1);
37        if (count2 > n / 3) result.add(cand2);
38
39        return result;
40    }
41}
42