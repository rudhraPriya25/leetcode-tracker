// Last updated: 7/27/2026, 3:40:11 PM
1class Solution {
2    public Node connect(Node root) {
3        if (root == null) return null;
4
5        Node curr = root;
6
7        while (curr != null) {
8            Node dummy = new Node(0); // dummy head for next level
9            Node tail = dummy;
10
11            while (curr != null) {
12                if (curr.left != null) {
13                    tail.next = curr.left;
14                    tail = tail.next;
15                }
16                if (curr.right != null) {
17                    tail.next = curr.right;
18                    tail = tail.next;
19                }
20                curr = curr.next; // move across current level
21            }
22
23            curr = dummy.next; // move down to next level
24        }
25
26        return root;
27    }
28}
29