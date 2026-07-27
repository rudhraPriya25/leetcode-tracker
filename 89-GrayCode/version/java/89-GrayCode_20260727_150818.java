// Last updated: 7/27/2026, 3:08:18 PM
1import java.util.*;
2
3class Solution {
4    public boolean isSymmetric(TreeNode root) {
5        if (root == null) return true;
6
7        Queue<TreeNode> queue = new LinkedList<>();
8        queue.add(root.left);
9        queue.add(root.right);
10
11        while (!queue.isEmpty()) {
12            TreeNode t1 = queue.poll();
13            TreeNode t2 = queue.poll();
14
15            if (t1 == null && t2 == null) continue;
16            if (t1 == null || t2 == null) return false;
17            if (t1.val != t2.val) return false;
18
19            // Add children in mirrored order
20            queue.add(t1.left);
21            queue.add(t2.right);
22            queue.add(t1.right);
23            queue.add(t2.left);
24        }
25
26        return true;
27    }
28}
29