// Last updated: 7/28/2026, 7:21:38 AM
1class Solution {
2    public void solve(char[][] board) {
3        if (board == null || board.length == 0) return;
4        int m = board.length, n = board[0].length;
5
6        // Step 1: Mark border-connected 'O's
7        for (int i = 0; i < m; i++) {
8            dfs(board, i, 0);
9            dfs(board, i, n - 1);
10        }
11        for (int j = 0; j < n; j++) {
12            dfs(board, 0, j);
13            dfs(board, m - 1, j);
14        }
15
16        // Step 2: Flip and restore
17        for (int i = 0; i < m; i++) {
18            for (int j = 0; j < n; j++) {
19                if (board[i][j] == 'O') {
20                    board[i][j] = 'X'; // captured
21                } else if (board[i][j] == '#') {
22                    board[i][j] = 'O'; // restore safe
23                }
24            }
25        }
26    }
27
28    private void dfs(char[][] board, int i, int j) {
29        int m = board.length, n = board[0].length;
30        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != 'O') return;
31
32        board[i][j] = '#'; // mark safe
33        dfs(board, i + 1, j);
34        dfs(board, i - 1, j);
35        dfs(board, i, j + 1);
36        dfs(board, i, j - 1);
37    }
38}
39