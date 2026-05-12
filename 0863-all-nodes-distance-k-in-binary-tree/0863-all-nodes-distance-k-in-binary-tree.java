/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void markParents(TreeNode root,HashMap<TreeNode,TreeNode> parent){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                q.add(curr.left);
                parent.put(curr.left,curr);
            }
            if(curr.right!=null){
                q.add(curr.right);
                parent.put(curr.right,curr);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
     HashMap<TreeNode,TreeNode> parent= new HashMap<>();
     markParents(root,parent);
     HashMap<TreeNode,Boolean> vis = new HashMap<>();
     Queue<TreeNode> q = new LinkedList<>();
     q.add(target);
     vis.put(target,true);
     int currLevel=0;
     while(!q.isEmpty()){
        int s= q.size();
        if(currLevel==k) break;
        currLevel++;
        TreeNode curr;
        for(int i=0;i<s;i++){
            curr=q.poll();
            if(curr.left!=null && vis.get(curr.left)==null){
                q.add(curr.left);
                vis.put(curr.left,true);
            }
             if(curr.right!=null && vis.get(curr.right)==null){
                q.add(curr.right);
                vis.put(curr.right,true);
            }
      if(parent.get(curr)!=null && vis.get(parent.get(curr))==null){
        q.add(parent.get(curr));
        vis.put(parent.get(curr),true);
      }

        }
     }
     List<Integer> list = new ArrayList<>();
     while(!q.isEmpty()){
        list.add(q.poll().val);
     }   
     return list;
    }
}