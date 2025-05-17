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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode dummy = new ListNode(-1);
        ListNode cur= dummy;
        int c=0;
        while(l1!=null||l2!=null||c!=0){
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            int s= v1+v2+c;
            c=s/10;
            cur.next= new ListNode(s%10);
            cur= cur.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2= l2.next;

        }
        return dummy.next;
        
    }
}