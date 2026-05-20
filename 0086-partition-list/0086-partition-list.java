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
    public ListNode partition(ListNode head, int x) {
        ListNode b4head= new ListNode(0);
        ListNode afhead= new ListNode(0);
        ListNode after=afhead;
        ListNode before=b4head;

        while(head!=null){
            if(head.val<x){
                before.next=head;
                before=before.next;
            }else{
                after.next=head;
                after=after.next;
            }
            head=head.next;
        }
        after.next=null;
        before.next=afhead.next;
        return b4head.next;
    }
}