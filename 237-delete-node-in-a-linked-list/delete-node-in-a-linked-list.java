/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode dum=node.next;
        while(dum.next!=null){
            node.val=dum.val;
            node=node.next;
            dum=dum.next;
        }
        node.val=dum.val;
        node.next=null;
    }
}