// Last updated: 7/27/2026, 3:41:52 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> getRow(int rowIndex) {
5        List<Integer> row = new ArrayList<>();
6        row.add(1); // first row
7
8        for (int i = 1; i <= rowIndex; i++) {
9            row.add(0); // expand size
10            for (int j = i; j > 0; j--) {
11                row.set(j, row.get(j) + row.get(j - 1));
12            }
13        }
14
15        return row;
16    }
17}
18