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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        ListNode slow=head,fast=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            if(fast.next!=null){
                fast=fast.next;
            }
        }
        ListNode tail=slow,prev=null,temp;
        while(tail!=null){
            temp=tail.next;
            tail.next=prev;
            prev=tail;
            tail=temp;
        }
        temp=slow;slow=head;fast=prev;
        while(true){
            if(fast==temp){
                if(slow.val!=fast.val){
                    return false;
                }
                break;
            }
            if(slow.val!=fast.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
            
            
        }
        return true;
    }
}