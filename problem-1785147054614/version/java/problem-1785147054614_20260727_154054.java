// Last updated: 7/27/2026, 3:40:54 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> generate(int numRows) {
5        List<List<Integer>> triangle = new ArrayList<>();
6
7        for (int i = 0; i < numRows; i++) {
8            List<Integer> row = new ArrayList<>();
9            row.add(1); // first element always 1
10
11            for (int j = 1; j < i; j++) {
12                int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
13                row.add(val);
14            }
15
16            if (i > 0) {
17                row.add(1); // last element always 1
18            }
19
20            triangle.add(row);
21        }
22
23        return triangle;
24    }
25}
26