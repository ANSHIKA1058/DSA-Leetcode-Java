
class Solution {
    HashMap<TreeNode,TreeNode> mp=new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        TreeNode startnode= getStartNode(root,start);
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> vis = new HashSet<>();
        q.add(startnode);
        vis.add(startnode);
        int t=-1;
        while(!q.isEmpty()){
            int s=q.size();
            t++;
            TreeNode curr;
            for(int i=0;i<s;i++){
                curr=q.poll();
                if(curr.left!=null && !vis.contains(curr.left)){
                    q.add(curr.left);
                    vis.add(curr.left);
                }
                if(curr.right!=null && !vis.contains(curr.right)){
                    q.add(curr.right);
                    vis.add(curr.right);
                }
                if(mp.containsKey(curr) && !vis.contains(mp.get(curr))){
                    q.add(mp.get(curr));
                    vis.add(mp.get(curr));

                }

            }
        }
        return t;
    }
    public TreeNode getStartNode(TreeNode root,int start){
        TreeNode startnode=null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s= q.size();
            TreeNode curr;
            for(int i=0;i<s;i++){
                curr=q.poll();
                if(curr.val==start){
                    startnode=curr;
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
        }
        return startnode;
    }
}