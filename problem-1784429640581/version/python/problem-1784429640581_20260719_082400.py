# Last updated: 7/19/2026, 8:24:00 AM
1class Solution:
2    def countDominantNodes(self, root: TreeNode | None) -> int:
3        ans = 0
4        def dfs(node):
5            nonlocal ans 
6            if not node:
7                return float('-inf')
8            leftMax = dfs(node.left)
9            rightMax = dfs(node.right)
10            currMax = max(node.val, leftMax, rightMax)
11            if node.val == currMax:
12                ans += 1
13            return currMax
14        dfs(root)
15        return ans
16        