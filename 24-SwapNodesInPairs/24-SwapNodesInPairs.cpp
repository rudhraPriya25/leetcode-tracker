// Last updated: 7/20/2026, 10:14:49 AM
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        // Dummy node to simplify edge cases
        ListNode dummy(0);
        dummy.next = head;
        ListNode* prev = &dummy;

        while (head && head->next) {
            ListNode* first = head;
            ListNode* second = head->next;

            // Swapping nodes
            prev->next = second;
            first->next = second->next;
            second->next = first;

            // Move pointers forward
            prev = first;
            head = first->next;
        }

        return dummy.next;
    }
};