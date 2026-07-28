// Last updated: 7/28/2026, 7:22:13 AM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> res = new ArrayList<>();
4        backtrack(s, 0, new ArrayList<>(), res);
5        return res;
6    }
7
8    private void backtrack(String s, int start, List<String> path, List<List<String>> res) {
9        if (start == s.length()) {
10            res.add(new ArrayList<>(path));
11            return;
12        }
13
14        for (int end = start + 1; end <= s.length(); end++) {
15            String sub = s.substring(start, end);
16            if (isPalindrome(sub)) {
17                path.add(sub);
18                backtrack(s, end, path, res);
19                path.remove(path.size() - 1);
20            }
21        }
22    }
23
24    private boolean isPalindrome(String str) {
25        int l = 0, r = str.length() - 1;
26        while (l < r) {
27            if (str.charAt(l++) != str.charAt(r--)) return false;
28        }
29        return true;
30    }
31}
32