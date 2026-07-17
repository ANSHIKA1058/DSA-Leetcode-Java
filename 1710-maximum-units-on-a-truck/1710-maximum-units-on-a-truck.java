class Solution {
    public int maximumUnits(int[][] arr, int truckSize) {
        Arrays.sort(arr,(a,b) -> Integer.compare(b[1],a[1]));
        int ans =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]<=truckSize){
                ans+=arr[i][0]*arr[i][1];
                truckSize-=arr[i][0];
            }else{
                ans+=truckSize*arr[i][1];
                break;
            }
        }
        return ans;
    }
}