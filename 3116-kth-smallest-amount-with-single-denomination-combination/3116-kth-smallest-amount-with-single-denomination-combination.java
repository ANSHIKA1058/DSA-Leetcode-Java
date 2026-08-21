class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long low =1;
        long high =(long) coins[0]*k;
        while(low<high){
            long mid= (low+high)/2;
            if(count(mid,coins)>=k){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public long count(long x,int[] coins){
        long ans =0;
        int n = coins.length;
        
        for(int mask=1;mask<(1<<n);mask++){
            long lcm =1;
            int bits=0;
            for(int i=0;i<n;i++){
                if((mask  & (1<<i))!=0){
                    lcm=lcm(lcm,coins[i]);
                    if(lcm>x) break;
                    bits++;
                }
            }

            if(lcm<=x){
                if(bits%2==1){
                    ans+=x/lcm;
                }else{
                    ans-=x/lcm;
                }
            }

            
        }
        return ans;
    }
    public long lcm(long a, long b){
        return a/gcd(a,b)*b;
    }
    public long gcd(long a, long b){
        return b==0?a:gcd(b,a%b);
    }
}