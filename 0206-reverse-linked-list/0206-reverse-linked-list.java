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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode temp= head;
        ListNode cur= head;
        ListNode prev= null;
        while(cur!=null){
            temp= cur.next;
            cur.next=prev;
            prev=cur;
            cur= temp;
        }
        return prev;
        
    }
}