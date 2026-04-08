class Solution {
    public int smallestNumber(int n) {
        //phli approch 
        int temp = n;
        int dig=0;
        while(temp>0){
            dig++;
            temp>>=1;
        }
        return (1<<dig)-1;
    }
}