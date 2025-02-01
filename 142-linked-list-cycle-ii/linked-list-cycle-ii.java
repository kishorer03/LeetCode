/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode slow=head,fast=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            if(fast.next==null){
                return null;
            }
            fast=fast.next;
            if(slow==fast){
                ListNode temp=head;
                while(true){
                    if(temp==slow){
                        return temp;
                    }
                    temp=temp.next;
                    slow=slow.next;
                }
                                
            }
        }
        return null;
    }
}