class Solution {
    public int smallestNumber(int n) {
        //tisra 
        int res=1;
        //n=10
        while(res<n){

            //10|1=3
            //110|1=7
            //1110|1=15>10 stop
            res=(res<<1)|1;
        }
        return res;//res=15 ans happy
    }

}