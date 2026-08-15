class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
      //rev the given graph
      int n= graph.length;
      List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indeg = new int[n];
        for(int i=0;i<n;i++){
            for(int ele:graph[i]){
            //in orgn graph , edge is from i to ele
            //in rev graph it will be ele to i
            adj.get(ele).add(i);
            indeg[i]++;
            }
        }
        //apply kahn's algo
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(indeg[i]==0) q.add(i);
        }

        while(q.size()>0){
            int front=q.remove();
            ans.add(front);
            for(int ele:adj.get(front)){
                indeg[ele]--;
                if(indeg[ele]==0) q.add(ele);
            }
        }
        Collections.sort(ans);
        return ans;
        
         
    }
}