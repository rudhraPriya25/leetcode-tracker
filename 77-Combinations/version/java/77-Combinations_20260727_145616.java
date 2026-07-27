// Last updated: 7/27/2026, 2:56:16 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix.length == 0) return 0;
4        int m = matrix.length, n = matrix[0].length;
5        int[] heights = new int[n];
6        int maxArea = 0;
7
8        for (int i = 0; i < m; i++) {
9            // Build histogram heights for this row
10            for (int j = 0; j < n; j++) {
11                if (matrix[i][j] == '1') {
12                    heights[j] += 1;
13                } else {
14                    heights[j] = 0;
15                }
16            }
17            // Apply Largest Rectangle in Histogram
18            maxArea = Math.max(maxArea, largestRectangleArea(heights));
19        }
20
21        return maxArea;
22    }
23
24    private int largestRectangleArea(int[] heights) {
25        Stack<Integer> stack = new Stack<>();
26        int maxArea = 0;
27
28        for (int i = 0; i <= heights.length; i++) {
29            int h = (i == heights.length ? 0 : heights[i]);
30
31            while (!stack.isEmpty() && h < heights[stack.peek()]) {
32                int height = heights[stack.pop()];
33                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
34                maxArea = Math.max(maxArea, height * width);
35            }
36            stack.push(i);
37        }
38
39        return maxArea;
40    }
41}
42