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
    public int len(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) {
            return head;
        }

        int N = len(head);
        int targetIndex = N - n + 1; 

        // Special case: remove head
        if (targetIndex == 1) {
            return head.next;
        }

        ListNode curr = head;
        ListNode prev = null;
        int i = 1;

        while (i < targetIndex) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        // Remove the node
        prev.next = curr.next;

        return head;
    }
}