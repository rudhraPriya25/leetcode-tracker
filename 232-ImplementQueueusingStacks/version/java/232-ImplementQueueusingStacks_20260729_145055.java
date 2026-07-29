// Last updated: 7/29/2026, 2:50:55 PM
1class Solution {
2    public int countDigitOne(int n) {
3        int count = 0;
4        long factor = 1; // start with ones place
5
6        while (factor <= n) {
7            long left = n / (factor * 10);
8            long curr = (n / factor) % 10;
9            long right = n % factor;
10
11            if (curr == 0) {
12                count += left * factor;
13            } else if (curr == 1) {
14                count += left * factor + right + 1;
15            } else {
16                count += (left + 1) * factor;
17            }
18
19            factor *= 10; // move to next digit place
20        }
21
22        return count;
23    }
24}
25