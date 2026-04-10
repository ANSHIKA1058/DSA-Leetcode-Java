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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode L1 = sortList(head);
        ListNode L2 = sortList(slow);
        return merge(L1,L2);
    }
    public ListNode merge(ListNode L1,ListNode L2){
        ListNode dummy = new ListNode(0);
        ListNode curr =dummy;
        while(L1!=null && L2!=null){
            if(L1.val<L2.val){
                curr.next = L1;
                L1=L1.next;
            }
            else{
                curr.next=L2;
                L2=L2.next;
            }
            curr=curr.next;
        }
        if(L1!=null){
            curr.next=L1;
        }
        if(L2!=null){
            curr.next=L2;
        }
        return dummy.next;
    }
}