// Last updated: 7/27/2026, 2:58:10 PM
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3        ListNode beforeDummy = new ListNode(0);
4        ListNode afterDummy = new ListNode(0);
5        ListNode before = beforeDummy;
6        ListNode after = afterDummy;
7
8        while (head != null) {
9            if (head.val < x) {
10                before.next = head;
11                before = before.next;
12            } else {
13                after.next = head;
14                after = after.next;
15            }
16            head = head.next;
17        }
18
19        // End the after list
20        after.next = null;
21        // Connect before list with after list
22        before.next = afterDummy.next;
23
24        return beforeDummy.next;
25    }
26}
27