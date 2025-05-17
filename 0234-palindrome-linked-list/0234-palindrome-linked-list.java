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
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow= slow.next;
           
        }
        return slow;        
    }
    public ListNode rev(ListNode head){
        ListNode temp= head;
        ListNode cur= head;
        ListNode prev=null;
        while(cur!=null){
            temp= cur.next;
            cur.next= prev;
            prev= cur;
            cur= temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode middle=mid(head);
        
        ListNode reverse= rev(middle);

        while(reverse!=null){
            if(head.val!=reverse.val){
                return false;
            }
            head= head.next;
            reverse= reverse.next;
        }
        return true;


        
    }
}