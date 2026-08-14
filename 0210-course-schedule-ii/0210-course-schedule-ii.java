class Solution {
    public int[] findOrder(int num, int[][] pre) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[num];

        for (int i = 0; i < pre.length; i++) {
            int a = pre[i][0];
            int b = pre[i][1];

            adj.get(b).add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

       

        while (!q.isEmpty()) {

            int front = q.poll();
            list.add(front);

            for (int ele : adj.get(front)) {

                indegree[ele]--;

                if (indegree[ele] == 0)
                    q.add(ele);
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        if(list.size()!=num) return new int[0];
        return ans;
    }


}