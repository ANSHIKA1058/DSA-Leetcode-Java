class Solution {
    public int smallestNumber(int n) {
        //n=5   1<<3 6-1=5
        //10  1<<4  16-1=15
        

        //dusri
        return (1<<(Integer.toBinaryString(n).length()))-1;
    }
}