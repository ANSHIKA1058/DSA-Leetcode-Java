class Solution {
    public int maximumUnits(int[][] arr, int truckSize) {
        int n = arr.length;
        int ans=0;
        Arrays.sort(arr,(a,b) -> Integer.compare(b[1],a[1]));
        for(int i=0;i<n;i++){
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