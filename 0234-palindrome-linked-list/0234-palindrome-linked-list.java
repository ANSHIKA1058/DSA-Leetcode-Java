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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            }
                ListNode newh=slow.next;
                ListNode prev=null;
                while(newh!=null){
                    ListNode next=newh.next;
                    newh.next=prev;
                    prev=newh;
                    newh=next;
                }
                ListNode first=head;
                ListNode sec=prev;
                while(sec!=null){
                    if(first.val!=sec.val){
                        return false;
                    }
                    first=first.next;
                    sec=sec.next;
                
            }
            return true;
        
    }
}