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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next== null){
            return head;
        }
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
          tail.next=head;
        k=k%len;
        if(k==0){
            tail.next=null;
            return head;
        }
      

        int steps= len-k-1;
        ListNode newtail = head;
        while(steps>0){
            newtail=newtail.next;
            steps--;
        }
        ListNode newhead=newtail.next;
        newtail.next=null;
        return newhead;
        
        }
}