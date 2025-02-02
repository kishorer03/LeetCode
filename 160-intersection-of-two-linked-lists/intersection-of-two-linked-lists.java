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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA=0,countB=0,diff=0;
        ListNode tempA=headA,tempB=headB;
        while(tempA!=null){
            ++countA;
            tempA=tempA.next;
        }
        while(tempB!=null){
            ++countB;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if(countA==countB){
            
        }else if(countA>countB){
            diff=countA-countB;
            while(diff>0){
                tempA=tempA.next;
                --diff;
            }
        }else if(countB>countA){
            diff=countB-countA;
            while(diff>0){
                tempB=tempB.next;
                --diff;
            }
        }
        while(tempA!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;
    }
}