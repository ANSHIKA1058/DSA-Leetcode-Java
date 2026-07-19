class Solution {
    public int findMaxK(int[] nums) {
        List<Integer> set = new ArrayList<>();
        int ans = -1;

        for(int x : nums){
            // agar x ka opposite set me milta hai
            if(set.contains(-x)){
                ans = Math.max(ans, Math.abs(x));
            }
            set.add(x);
        }

        return ans;
    }
}
