/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<TreeNode,TreeNode> mp = new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        TreeNode startnode = getStartNode(root,start);
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> vis = new HashSet<>();
        q.offer(startnode);
        int time=-1;
        vis.add(startnode);
        while(!q.isEmpty()){
            int size=q.size();
            time++;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null && !vis.contains(curr.left)){
                    q.offer(curr.left);
                    vis.add(curr.left);
                }
                if(curr.right!=null && !vis.contains(curr.right)){
                    q.offer(curr.right);
                    vis.add(curr.right);
                }
                if(mp.containsKey(curr) && !vis.contains(mp.get(curr))){
                    vis.add(mp.get(curr));
                    q.offer(mp.get(curr));
                }
            }
        }
        return time;
    }


    public TreeNode getStartNode(TreeNode root,int start){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode startnode=null;
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.val==start){
                startnode=curr;
            }
            if(curr.left!=null){
                mp.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right!=null){
                mp.put(curr.right,curr);
                q.offer(curr.right);
            }

        }
        return startnode;
    }
}