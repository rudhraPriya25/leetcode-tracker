// Last updated: 7/27/2026, 3:14:56 PM
1class Solution {
2    public TreeNode sortedListToBST(ListNode head) {
3        if (head == null) return null;
4        return build(head, null);
5    }
6
7    private TreeNode build(ListNode head, ListNode tail) {
8        if (head == tail) return null;
9
10        ListNode slow = head, fast = head;
11        while (fast != tail && fast.next != tail) {
12            slow = slow.next;
13            fast = fast.next.next;
14        }
15
16        TreeNode root = new TreeNode(slow.val);
17        root.left = build(head, slow);
18        root.right = build(slow.next, tail);
19
20        return root;
21    }
22}
23