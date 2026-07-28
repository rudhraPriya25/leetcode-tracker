// Last updated: 7/28/2026, 4:05:24 PM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                // Skip duplicate
                curr.next = curr.next.next;
            } else {
                curr = curr.next; // move forward
            }
        }

        return head;
    }
}
