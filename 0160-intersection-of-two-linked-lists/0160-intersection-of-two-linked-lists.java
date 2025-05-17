/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int len(ListNode head){
        int size=0;
        while(head!=null){
            head= head.next;
            size++;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null ||headB==null){
            return null;
        }
        int lenA=len(headA);
        int lenB= len(headB);
        if(lenA>lenB){
            int i =lenA-lenB;
            while(i>0){
                headA= headA.next;
                i--;
            }
        }
        else if(lenB>lenA){
            int i = lenB-lenA;
            while(i>0){
                headB= headB.next;
                i--;
            }
        }
        while(headA!=null || headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB= headB.next;
        }

        return null;
    }
}