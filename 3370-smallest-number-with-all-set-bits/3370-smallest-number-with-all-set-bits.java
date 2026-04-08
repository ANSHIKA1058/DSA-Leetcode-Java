class Solution {
    public int smallestNumber(int n) {
        //dusri
        return (1<<(Integer.toBinaryString(n).length()))-1;
    }
}