// Last updated: 7/28/2026, 7:42:19 AM
1class Solution {
2    public int numIslands(char[][] grid) {
3        if (grid == null || grid.length == 0) return 0;
4
5        int count = 0;
6        int rows = grid.length, cols = grid[0].length;
7
8        for (int r = 0; r < rows; r++) {
9            for (int c = 0; c < cols; c++) {
10                if (grid[r][c] == '1') {
11                    count++;
12                    dfs(grid, r, c);
13                }
14            }
15        }
16
17        return count;
18    }
19
20    private void dfs(char[][] grid, int r, int c) {
21        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') {
22            return;
23        }
24
25        grid[r][c] = '0'; // mark visited
26
27        dfs(grid, r + 1, c); // down
28        dfs(grid, r - 1, c); // up
29        dfs(grid, r, c + 1); // right
30        dfs(grid, r, c - 1); // left
31    }
32}
33