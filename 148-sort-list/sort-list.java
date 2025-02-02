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
    public ListNode merge(ListNode left,ListNode right){
        ListNode temp=new ListNode(-1,null),ret=temp;
        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
            }else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left==null){
            temp.next=right;
        }
        if(right==null){
            temp.next=left;
        }
        return ret.next;
    }
    public ListNode sortList(ListNode head) {
        if(head== null || head.next==null){
            return head;
        }
        ListNode mid=head,st=head.next;
        while(st!=null && st.next!=null){
            mid=mid.next;
            st=st.next.next;
        }
        ListNode next=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(next);

        return merge(left,right);
    }
}