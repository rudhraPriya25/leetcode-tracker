// Last updated: 7/28/2026, 4:03:53 PM
class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node curr = root;

        while (curr != null) {
            Node dummy = new Node(0); // dummy head for next level
            Node tail = dummy;

            while (curr != null) {
                if (curr.left != null) {
                    tail.next = curr.left;
                    tail = tail.next;
                }
                if (curr.right != null) {
                    tail.next = curr.right;
                    tail = tail.next;
                }
                curr = curr.next; // move across current level
            }

            curr = dummy.next; // move down to next level
        }

        return root;
    }
}
