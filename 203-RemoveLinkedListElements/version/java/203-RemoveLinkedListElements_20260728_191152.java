// Last updated: 7/28/2026, 7:11:52 PM
1class Solution {
2    public ListNode removeElements(ListNode head, int val) {
3        // Step 1: Create a dummy node before head
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        // Step 2: Use two pointers
8        ListNode curr = dummy;
9        while (curr.next != null) {
10            if (curr.next.val == val) {
11                // Skip the node with matching value
12                curr.next = curr.next.next;
13            } else {
14                curr = curr.next;
15            }
16        }
17
18        // Step 3: Return the new head
19        return dummy.next;
20    }
21}
22