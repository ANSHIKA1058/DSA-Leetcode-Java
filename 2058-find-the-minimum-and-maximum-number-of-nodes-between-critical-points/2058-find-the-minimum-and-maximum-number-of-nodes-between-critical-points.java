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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null ||head.next==null ||head.next.next==null){
            return new int[]{-1,-1};
        }
        ListNode prev = head;
        ListNode curr= head.next;
        ArrayList<Integer> list = new ArrayList<>();

        int idx=2;
        while(curr.next!=null){
            int nextVal = curr.next.val;
            if((curr.val>prev.val && curr.val>nextVal)||
            (curr.val<prev.val && curr.val<nextVal)){
                list.add(idx);
            }
            prev = curr;
            curr= curr.next;
            idx++;
        }
        if(list.size()<2){
            return new int[]{-1,-1};
        }
        int minDis = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            minDis= Math.min(minDis,(list.get(i)-list.get(i-1)));

        }
        int maxDis = list.get(list.size()-1)-list.get(0);
        return new int[]{minDis,maxDis};
    }
}