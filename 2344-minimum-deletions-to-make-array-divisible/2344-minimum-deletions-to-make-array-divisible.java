class Solution {

    public int Findgcd(int a, int b){
        if(b==0) return a;
        return Findgcd(b,a%b);
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        int n = nums.length;
        int nd = numsDivide.length;
        int gcd = numsDivide[0];
        for(int i=1;i<nd;i++){
            gcd = Findgcd(gcd,numsDivide[i]);
        }
           Arrays.sort(nums);
            int c=0;
            for(int i=0;i<n;i++){
                int a =nums[i];
                if(gcd%a==0){
                    return c;
                }else{
                    c++;
                }
            }

            
        return -1; 
    }
    
}