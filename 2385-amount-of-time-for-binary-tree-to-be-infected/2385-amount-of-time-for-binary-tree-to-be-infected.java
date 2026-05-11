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
        TreeNode startNode =getStartNode(root,start);
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> vis= new HashSet<>();
        q.add(startNode);
        vis.add(startNode);
        int time=-1;
        while(!q.isEmpty()){
            int s = q.size();
            time++;
            TreeNode curr;
            for(int i=0;i<s;i++){
                curr=q.poll();
                if(curr.left!=null && !vis.contains(curr.left)){
                    q.add(curr.left);
                    vis.add(curr.left);
                }
                if(curr.right!=null && !vis.contains(curr.right)){
                    vis.add(curr.right);
                    q.add(curr.right);
                }
                if(mp.containsKey(curr) && !vis.contains(mp.get(curr))){
                    vis.add(mp.get(curr));
                    q.add(mp.get(curr));
                }
            }
            
        }
        return time;
    }
    public TreeNode getStartNode(TreeNode root,int start){
        TreeNode startNode = null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.val==start){
                startNode=curr;
            }
            if(curr.left!=null){
                q.add(curr.left);
                mp.put(curr.left,curr);
            }
            if(curr.right!=null){
                q.add(curr.right);
                mp.put(curr.right,curr);
            }
        }
        return startNode;
    }
}