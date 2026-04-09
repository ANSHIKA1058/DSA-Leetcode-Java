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
        int countA=0;
        int countB =0;
        ListNode listA = headA;
        ListNode listB= headB;
        while(listA!=null){
            countA++;
            listA=listA.next;
        }
        while(listB!=null){
            countB++;
            listB=listB.next;
        }
        listA=headA;
        listB=headB;
        if(countA>countB){
            int steps=countA-countB;
            for(int i=0;i<steps;i++){
                listA=listA.next;
            }
        }else{
            int steps= countB-countA;
            for(int i=0;i<steps;i++){
                listB=listB.next;
            }
        }
        while(listA!=listB){
            listA=listA.next;
            listB=listB.next;
        }
return listA;
    }
}