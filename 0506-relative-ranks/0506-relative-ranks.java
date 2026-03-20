class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n =score.length;
            String[] ans = new String[n];
            HashMap<Integer,String> mp = new HashMap<>();
            int[] sorted=score.clone();
            Arrays.sort(sorted);
            for(int i=n-1;i>=0;i--){
                if(i==n-1){
                    mp.put(sorted[i],"Gold Medal");
                }else if(i==n-2){
                    mp.put(sorted[i],"Silver Medal");
                }
                else if(i==n-3){
                    mp.put(sorted[i],"Bronze Medal");
                }else{
                    mp.put(sorted[i],String.valueOf(n-i));
                }
            }

            for(int i=0;i<n;i++){
                ans[i]=mp.get(score[i]);
            }
            return ans;
    }
}