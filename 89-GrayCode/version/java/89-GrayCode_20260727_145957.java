// Last updated: 7/27/2026, 2:59:57 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> grayCode(int n) {
5        List<Integer> result = new ArrayList<>();
6        int size = 1 << n; // 2^n
7
8        for (int i = 0; i < size; i++) {
9            result.add(i ^ (i >> 1));
10        }
11
12        return result;
13    }
14}
15