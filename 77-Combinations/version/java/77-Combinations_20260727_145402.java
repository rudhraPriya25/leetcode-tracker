// Last updated: 7/27/2026, 2:54:02 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        if (head == null) return null;
4
5        ListNode dummy = new ListNode(0);
6        dummy.next = head;
7        ListNode prev = dummy;
8        ListNode curr = head;
9
10        while (curr != null) {
11            // Check if current node has duplicates
12            if (curr.next != null && curr.val == curr.next.val) {
13                // Skip all nodes with this value
14                while (curr.next != null && curr.val == curr.next.val) {
15                    curr = curr.next;
16                }
17                // Link prev to the node after duplicates
18                prev.next = curr.next;
19            } else {
20                prev = prev.next; // move prev forward
21            }
22            curr = curr.next; // move curr forward
23        }
24
25        return dummy.next;
26    }
27}
28