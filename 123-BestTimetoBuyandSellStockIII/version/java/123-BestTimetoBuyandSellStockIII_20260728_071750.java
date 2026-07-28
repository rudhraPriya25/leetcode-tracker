// Last updated: 7/28/2026, 7:17:50 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0, right = s.length() - 1;
4
5        while (left < right) {
6            // Skip non-alphanumeric
7            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
8                left++;
9            }
10            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
11                right--;
12            }
13
14            // Compare ignoring case
15            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
16                return false;
17            }
18
19            left++;
20            right--;
21        }
22
23        return true;
24    }
25}
26