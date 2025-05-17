/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // First, check if there are at least k nodes to reverse
        ListNode ptr = head;
        for (int i = 0; i < k; i++) {
            if (ptr == null) return head; // not enough nodes
            ptr = ptr.next;
        }

        // Reverse k nodes
        ListNode prev = null, cur = head, temp = null;
        int count = 0;

        while (cur != null && count < k) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            count++;
        }

        // Recursively call for the next segment
        if (temp != null) {
            head.next = reverseKGroup(temp, k);
        }

        // prev is the new head after reversing
        return prev;
    }
}
