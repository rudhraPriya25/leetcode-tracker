// Last updated: 7/20/2026, 10:14:56 AM
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        // Create a dummy node to simplify edge cases
        ListNode dummy;
        ListNode* tail = &dummy;

        // Traverse both lists and append the smaller node to the merged list
        while (list1 && list2) {
            if (list1->val < list2->val) {
                tail->next = list1;
                list1 = list1->next;
            } else {
                tail->next = list2;
                list2 = list2->next;
            }
            tail = tail->next;
        }

        // Append the remaining nodes from either list
        tail->next = list1 ? list1 : list2;

        // Return the head of the merged list
        return dummy.next;
    }
};