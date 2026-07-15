class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        List<Integer> list = new ArrayList<>();
        int sum=0;
        for(int i=1;i<n;i++){
            if(prices[i-1]<prices[i]){
                list.add(prices[i]-prices[i-1]);
            }
        }
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
        
    }
}