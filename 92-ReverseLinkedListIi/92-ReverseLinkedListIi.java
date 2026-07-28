// Last updated: 7/28/2026, 4:05:03 PM
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Step 1: move prev to node before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: reverse sublist
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode prevSub = null;

        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = prevSub;
            prevSub = curr;
            curr = next;
        }

        // Step 3: reconnect
        prev.next.next = curr;   // tail of reversed part connects to remainder
        prev.next = prevSub;     // prev connects to new head of reversed part

        return dummy.next;
    }
}
