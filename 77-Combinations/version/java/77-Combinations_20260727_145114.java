// Last updated: 7/27/2026, 2:51:14 PM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        int m = board.length, n = board[0].length;
4
5        for (int i = 0; i < m; i++) {
6            for (int j = 0; j < n; j++) {
7                if (dfs(board, word, i, j, 0)) {
8                    return true;
9                }
10            }
11        }
12        return false;
13    }
14
15    private boolean dfs(char[][] board, String word, int i, int j, int index) {
16        // Base case: word completely matched
17        if (index == word.length()) return true;
18
19        // Boundary + mismatch check
20        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length 
21            || board[i][j] != word.charAt(index)) {
22            return false;
23        }
24
25        // Mark visited
26        char temp = board[i][j];
27        board[i][j] = '#';
28
29        // Explore neighbors
30        boolean found = dfs(board, word, i+1, j, index+1) ||
31                        dfs(board, word, i-1, j, index+1) ||
32                        dfs(board, word, i, j+1, index+1) ||
33                        dfs(board, word, i, j-1, index+1);
34
35        // Backtrack (restore cell)
36        board[i][j] = temp;
37
38        return found;
39    }
40}
41