class Solution {
    public long countCommas(long n) {
        long ans=0;
        long curr=1000L;
        long countperNo=1;
        while(n>=curr){
            long nextLimit = curr*1000L;
            long upperLimit=(nextLimit>curr && n>=nextLimit)?nextLimit-1:n;
            ans+=(upperLimit-curr+1)*countperNo;
            if(nextLimit<curr){
                break;
            }
            curr=nextLimit;
            countperNo++;
        }
        return ans;
    }
}