/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node t =head;
        Node r = null;
        if(head==null) return null;
        while(t!=null){
            if(t.child==null){
                r=t;
                t=t.next;
            }else{
                Node nextnode = t.next;
                Node childhead=flatten(t.child);
                t.next=childhead;
                childhead.prev=t;
                t.child=null;
                r=childhead;
                while(r.next!=null){
                    r=r.next;
                }
                r.next=nextnode;
                if(nextnode!=null){
                    nextnode.prev=r;
                    
                }
                t=nextnode;
            }
        }
        return head;
        
    }
}