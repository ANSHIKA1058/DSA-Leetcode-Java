class Solution {
    public int findKthLargest(int[] nums, int k) {
        int l =0;
        int r=nums.length-1;
        merge(nums,l,r);
        return nums[nums.length-k];
    }
    public void merge(int nums[],int l,int r){
        if(l<r){
            int mid = l+(r-l)/2;
            merge(nums,l,mid);
            merge(nums,mid+1,r);
            mergeSort(nums,l,mid,r);
        }
        }

        public void mergeSort(int[] nums, int l, int mid, int r){
            int L=mid-l+1;
            int R= r-mid;
            int[] Left = new int[L];
            int[] Right = new int[R];

            for(int i=0;i<L;i++){
                Left[i]=nums[i+l];
            }
            for(int j=0;j<R;j++){
                Right[j]=nums[j+mid+1];
            }

            int i=0;
            int j=0;
            int k=l;
            while(i<L && j<R){
                if(Left[i]<=Right[j]){
                    nums[k]=Left[i];
                    i++;
                }
            else{
                nums[k]=Right[j];
                j++;
            }
            k++;
            }
            while(i<L){
                nums[k]=Left[i];
                i++;
                k++;
            }
            while(j<R){
                nums[k]=Right[j];
                j++;
                k++;
            }

        }
}