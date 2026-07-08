class Solution {
    public void makingparent(TreeNode root,HashMap<TreeNode,TreeNode> mp){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode curr;
        while(!q.isEmpty()){
            curr=q.poll();
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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> parent = new HashMap<>();
        makingparent(root,parent);
        HashMap<TreeNode,Boolean> vis = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        vis.put(target,true);
        int currlevel =0;
        while(!q.isEmpty()){
            int s= q.size();
            if(currlevel==k) break;
            currlevel++;
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
                //5-3
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