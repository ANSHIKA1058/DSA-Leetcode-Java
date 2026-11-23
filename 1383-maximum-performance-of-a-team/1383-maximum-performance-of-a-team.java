class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] eng = new int[n][2];
        for(int i=0;i<n;i++){
            eng[i][0]=efficiency[i];
            eng[i][1]=speed[i];
        }

        Arrays.sort(eng,(a,b)->Integer.compare(b[0],a[0]));

        long ans=0;

        long totalsp=0;

         int MOD = 1000000007;
        PriorityQueue<Integer> minhp = new PriorityQueue<>();
        for(int[] e:eng){
            int ef=e[0];
            int sp=e[1];

            minhp.add(sp);
            totalsp+=sp;

            while(minhp.size()>k){
                totalsp-=minhp.poll();
            }

            long perf=totalsp*ef;
            ans=Math.max(ans,perf);
        } 
        return (int)(ans%MOD);

    }
}