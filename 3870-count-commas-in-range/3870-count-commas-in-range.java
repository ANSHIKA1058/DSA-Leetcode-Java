class Solution {
    public int countCommas(int n) {
        int c=0;
        int temp=n;
        while(temp>0){
            temp/=10;
            c++;
        }
        if(c<4) return 0;
        if(c>=4) return n-999;
    return 0;
    }
}