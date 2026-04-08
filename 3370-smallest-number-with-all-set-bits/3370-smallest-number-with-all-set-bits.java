class Solution {
    public int smallestNumber(int n) {
        //phli approch 
        //n=10
        int temp = n;
        //temp=10
        int dig=0;
        while(temp>0){
            //10>0 dig=1 temp=5
            //5>0 dig=2 temp=2
            //2>0 dig =3 temp =1
            //1>0 dig =4 temp =0
            dig++;
            temp>>=1;
        }
        //8-1=7 ans 
        return (1<<dig)-1;
    }
}