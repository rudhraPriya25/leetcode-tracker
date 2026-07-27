// Last updated: 7/27/2026, 3:13:38 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> levelOrderBottom(TreeNode root) {
5        List<List<Integer>> result = new ArrayList<>();
6        if (root == null) return result;
7
8        Queue<TreeNode> queue = new LinkedList<>();
9        queue.add(root);
10
11        while (!queue.isEmpty()) {
12            int size = queue.size();
13            List<Integer> level = new ArrayList<>();
14
15            for (int i = 0; i < size; i++) {
16                TreeNode node = queue.poll();
17                level.add(node.val);
18
19                if (node.left != null) queue.add(node.left);
20                if (node.right != null) queue.add(node.right);
21            }
22
23            result.add(level);
24        }
25
26        Collections.reverse(result); // reverse levels for bottom-up
27        return result;
28    }
29}
30