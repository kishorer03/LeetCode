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
    public ListNode reverse(ListNode head,ListNode prev){
        ListNode temp;
        while(head!=null){
            temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1){
            return head;
        }
        boolean initial=true;
        ListNode frontTemp=head,backTemp=null,dum=head,contain=null;
        while(frontTemp!=null){
            int count=k;
            dum=frontTemp;
            while(count>1){
                dum=dum.next;
                if(dum==null){
                    return head;
                }
                --count;
            }
            contain=dum.next;
            dum.next=null;
            if(initial){
                initial=false;
                head=reverse(frontTemp,contain);
            }else{
                backTemp.next=reverse(frontTemp,contain);
            }
            backTemp=frontTemp;
            frontTemp=contain;
        }
        return head;
    }
}