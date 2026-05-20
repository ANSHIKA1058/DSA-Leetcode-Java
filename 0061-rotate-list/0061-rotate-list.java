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
        if(head==null || head.next==null || k==0){
            return head;
        }
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%len;
        ListNode newtail=head;
        int n =len-k;
        for(int i=1;i<n;i++){
            newtail=newtail.next;
        }
        ListNode newhead=newtail.next;
        newtail.next=null;
        return newhead;
    }
}