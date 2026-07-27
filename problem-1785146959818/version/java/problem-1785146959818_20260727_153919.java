// Last updated: 7/27/2026, 3:39:19 PM
1class Solution {
2    public Node connect(Node root) {
3        if (root == null) return null;
4
5        Node leftmost = root;
6
7        while (leftmost.left != null) {
8            Node head = leftmost;
9
10            while (head != null) {
11                // Connect left → right
12                head.left.next = head.right;
13
14                // Connect right → next left (if exists)
15                if (head.next != null) {
16                    head.right.next = head.next.left;
17                }
18
19                head = head.next; // move across the level
20            }
21
22            leftmost = leftmost.left; // move down one level
23        }
24
25        return root;
26    }
27}
28