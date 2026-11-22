class Solution {

    public int findgcd(int a, int b){
        if(b==0) return a;
        return findgcd(b,a%b);
    }

    public int minOperations(int[] nums, int[] numdiv) {
        int n = nums.length;
        int nd= numdiv.length;
        int count=0;
        Arrays.sort(nums);
        int gcd=numdiv[0];
        for(int i=1;i<nd;i++){
            gcd=findgcd(gcd,numdiv[i]);
        }

        for(int i=0;i<n;i++){
            if(gcd%nums[i]==0){
                return count;
            }else{
                count++;
            }
        }
        return -1;
    }
}