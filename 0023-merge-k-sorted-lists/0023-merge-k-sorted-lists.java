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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;
        }
        return divide(lists,0,lists.length-1);
    }
    public ListNode divide(ListNode[] lists,int l , int r){
        if(r==l){
            return lists[l];
        }
        int mid = (l+r)/2;
        ListNode L1 = divide(lists,l,mid);
        ListNode L2 = divide(lists,mid+1,r);
        return merge(L1,L2);
    }
    public ListNode merge(ListNode L1, ListNode L2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(L1!=null && L2!=null){
            if(L1.val<L2.val){
                curr.next=L1;
                L1=L1.next;
            }else{
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