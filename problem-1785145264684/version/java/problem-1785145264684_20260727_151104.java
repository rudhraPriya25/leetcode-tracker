// Last updated: 7/27/2026, 3:11:04 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
5        List<List<Integer>> result = new ArrayList<>();
6        if (root == null) return result;
7
8        Queue<TreeNode> queue = new LinkedList<>();
9        queue.add(root);
10        boolean leftToRight = true;
11
12        while (!queue.isEmpty()) {
13            int size = queue.size();
14            List<Integer> level = new ArrayList<>();
15
16            for (int i = 0; i < size; i++) {
17                TreeNode node = queue.poll();
18                level.add(node.val);
19
20                if (node.left != null) queue.add(node.left);
21                if (node.right != null) queue.add(node.right);
22            }
23
24            if (!leftToRight) {
25                Collections.reverse(level);
26            }
27            result.add(level);
28
29            leftToRight = !leftToRight; // flip direction
30        }
31
32        return result;
33    }
34}
35