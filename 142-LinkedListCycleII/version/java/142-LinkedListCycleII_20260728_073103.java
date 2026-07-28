// Last updated: 7/28/2026, 7:31:03 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13        if (head == null || head.next == null) return;
14
15        // Step 1: Find middle
16        ListNode slow = head, fast = head;
17        while (fast != null && fast.next != null) {
18            slow = slow.next;
19            fast = fast.next.next;
20        }
21
22        // Step 2: Reverse second half
23        ListNode prev = null, curr = slow.next;
24        slow.next = null; // cut the list
25        while (curr != null) {
26            ListNode next = curr.next;
27            curr.next = prev;
28            prev = curr;
29            curr = next;
30        }
31
32        // Step 3: Merge two halves
33        ListNode first = head, second = prev;
34        while (second != null) {
35            ListNode tmp1 = first.next;
36            ListNode tmp2 = second.next;
37
38            first.next = second;
39            second.next = tmp1;
40
41            first = tmp1;
42            second = tmp2;
43        }
44    }
45}
46