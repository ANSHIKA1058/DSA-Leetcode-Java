class Solution {
    public boolean canFinish(int num, int[][] pre) {

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

        for (int i = 0; i < num; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

        int count = 0;

        while (!q.isEmpty()) {

            int front = q.poll();
            count++;

            for (int ele : adj.get(front)) {

                indegree[ele]--;

                if (indegree[ele] == 0)
                    q.add(ele);
            }
        }

        return count == num;
    }
}