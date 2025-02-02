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
        ListNode temp1=l1,temp2=l2;
        int carry=0;
        while(temp1!=null && temp2!=null){
            temp1.val=temp1.val+temp2.val+carry;
            carry=temp1.val/10;
            temp1.val%=10;
            temp2.val=temp1.val;
            if(temp1.next==null && temp2.next==null){
                if(carry==1){
                        temp1.next=new ListNode(1,null);
                        carry=0;
                    }
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1!=null){
            while(temp1!=null){
                temp1.val+=carry;
                carry=temp1.val/10;
                temp1.val%=10;
                if(temp1.next==null){
                    if(carry==1){
                        temp1.next=new ListNode(1,null);
                        carry=0;
                    }
                }
                temp1=temp1.next;
            }
            return l1;
        }
        if(temp2!=null){
            while(temp2!=null){
                temp2.val+=carry;
                carry=temp2.val/10;
                temp2.val%=10;
                if(temp2.next==null){
                    if(carry==1){
                        temp2.next=new ListNode(1,null);
                        carry=0;
                    }
                }
                temp2=temp2.next;
            }
            return l2;
        }
        return l1;
        
    }
}