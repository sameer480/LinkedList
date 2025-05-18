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
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int N = len(head);
        k %= N;
        if (k == 0) return head;

        int stepsToNewHead = N - k;
        ListNode cur = head;
        ListNode prev = null;

        while (stepsToNewHead > 0) {
            prev = cur;
            cur = cur.next;
            stepsToNewHead--;
        }

        // Break the list and reconnect
        prev.next = null;
        ListNode newHead = cur;

        // Move to end of the rotated part and link to old head
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = head;

        return newHead;
    }
}
