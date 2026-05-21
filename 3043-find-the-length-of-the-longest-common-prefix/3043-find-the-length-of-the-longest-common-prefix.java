class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
       HashSet<Integer> st = new HashSet<>();
       for(int x:arr1){
        while(x>0){
            st.add(x);
            x/=10;
        }

       }
       int ans=0;
       for(int y:arr2){
        while(y>0){
            if(st.contains(y)){
                ans=Math.max(ans,String.valueOf(y).length());
                break;
            }
            y/=10;
        }
       }
       return ans;
    }
}