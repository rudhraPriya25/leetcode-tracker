// Last updated: 7/28/2026, 9:01:49 PM
1import java.util.*;
2
3class Solution {
4    public int kthSmallest(TreeNode root, int k) {
5        Stack<TreeNode> stack = new Stack<>();
6        TreeNode curr = root;
7
8        while (curr != null || !stack.isEmpty()) {
9            while (curr != null) {
10                stack.push(curr);
11                curr = curr.left;
12            }
13            curr = stack.pop();
14            k--;
15            if (k == 0) return curr.val;
16            curr = curr.right;
17        }
18        return -1; // should never reach here if k is valid
19    }
20}
21