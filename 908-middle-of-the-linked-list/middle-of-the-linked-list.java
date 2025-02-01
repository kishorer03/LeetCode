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
    public ListNode middleNode(ListNode head) {
        ListNode dum=head;
        int count=0;
        while(dum!=null){
            ++count;
            dum=dum.next;
        }
        count=(count)/2;
        dum=head;
        while(count>0){
            dum=dum.next;
            --count;
        }
        return dum;
    }
}