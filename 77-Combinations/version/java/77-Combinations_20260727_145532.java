// Last updated: 7/27/2026, 2:55:32 PM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        int n = heights.length;
4        Stack<Integer> stack = new Stack<>();
5        int maxArea = 0;
6
7        for (int i = 0; i <= n; i++) {
8            int h = (i == n ? 0 : heights[i]); // sentinel 0 at end
9
10            while (!stack.isEmpty() && h < heights[stack.peek()]) {
11                int height = heights[stack.pop()];
12                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
13                maxArea = Math.max(maxArea, height * width);
14            }
15            stack.push(i);
16        }
17
18        return maxArea;
19    }
20}
21