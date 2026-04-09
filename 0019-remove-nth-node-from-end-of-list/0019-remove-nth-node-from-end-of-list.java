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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int x = count-n-1;
        if(count==n){
            return head.next;
        }
        temp=head;
      int i=1;
      while(i<=x){
        i++;
        temp=temp.next;
      }
      temp.next=temp.next.next;

        
        return head;
    }
}