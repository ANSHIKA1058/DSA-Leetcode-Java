class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int j=0;
        int k=0;
        for(int i=2;i<n;i++){
            if(arr1.get(j)>arr2.get(k)){
                arr1.add(nums[i]);
                j++;
            }else{
                arr2.add(nums[i]);
                k++;
            }
        }
        for(int i=0;i<arr1.size();i++){
            nums[i]=arr1.get(i);
        }
        k=0;
        for(int l=arr1.size();l<(arr1.size()+arr2.size());l++){
            nums[l]=arr2.get(k++);
        }
        
        return nums;
    }
}