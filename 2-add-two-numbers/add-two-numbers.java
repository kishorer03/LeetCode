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
        ListNode head=new ListNode(0,null);
        ListNode temp=head;
        int carry=0,sum=0,rem=0;
        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){
                sum=l1.val+l2.val+carry;
                rem=sum%10;
                carry=sum/10;
                temp.next=new ListNode(rem,null);
                temp=temp.next;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1==null && l2!=null){
                sum=l2.val+carry;
                rem=sum%10;
                carry=sum/10;
                temp.next=new ListNode(rem,null);
                temp=temp.next;
                l2=l2.next;
            }else if(l1!=null && l2==null){
                sum=l1.val+carry;
                rem=sum%10;
                carry=sum/10;
                temp.next=new ListNode(rem,null);
                temp=temp.next;
                l1=l1.next;
            }            
        }
        if(carry>0){
            temp.next=new ListNode(carry,null);
        }
        return head.next;
    }
}