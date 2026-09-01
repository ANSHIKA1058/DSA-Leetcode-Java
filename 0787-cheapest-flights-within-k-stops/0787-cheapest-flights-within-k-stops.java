class Solution {

    class Pair{
        int node;
        int cost;
        Pair(int node, int cost){
            this.node = node;
            this.cost = cost;
        }

    }

    class Triplet implements Comparable<Triplet>{
        int node;
        int price;
        int stops;
        Triplet(int node, int price, int stops){
            this.node=node;
            this.price=price;
            this.stops=stops;
        }
        public int compareTo(Triplet t){
            if(this.stops==t.stops) return this.price-t.price;
            return this.stops-t.stops;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<flights.length;i++){
            int from = flights[i][0];
            int to = flights[i][1];
            int cost = flights[i][2];

            list.get(from).add(new Pair(to,cost));
        }
        int[][] ans = new int[n][k+2];
        for(int i=0;i<n;i++){
            for(int j=0;j<k+2;j++){
                ans[i][j]=Integer.MAX_VALUE;
            }
        }
        ans[src][0]=0;
        PriorityQueue<Triplet> pq= new PriorityQueue<>();
        pq.add(new Triplet(src,0,0));//node price stops

        while(!pq.isEmpty()){
            Triplet top = pq.remove();
            int node = top.node;
            int price = top.price;
            int stops= top.stops;
            if(stops==k+1) continue;
            for(Pair p:list.get(node)){
                int totalCost = price+p.cost;
                if(totalCost<ans[p.node][stops+1]){
                    ans[p.node][stops+1]=totalCost;
                    pq.add(new Triplet(p.node,totalCost,stops+1));
                }
            }
        }
        int result = Integer.MAX_VALUE;
        for(int stop=0;stop<=k+1;stop++){
            result=Math.min(result,ans[dst][stop]);
        }

        if(result==Integer.MAX_VALUE){
            return -1;
        }
        return result;

    }
}