// Last updated: 7/28/2026, 4:05:26 PM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            // Check if current node has duplicates
            if (curr.next != null && curr.val == curr.next.val) {
                // Skip all nodes with this value
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                // Link prev to the node after duplicates
                prev.next = curr.next;
            } else {
                prev = prev.next; // move prev forward
            }
            curr = curr.next; // move curr forward
        }

        return dummy.next;
    }
}
