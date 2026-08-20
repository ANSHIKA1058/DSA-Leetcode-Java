class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
         List<Integer> arr2 = new ArrayList<>();
         arr1.add(nums[0]);
         arr2.add(nums[1]);

         int k=0;//arr1
         int j=0;//arr2
         for(int i=2;i<n;i++){
            if(arr1.get(k)>arr2.get(j)){
                arr1.add(nums[i]);
                k++;
            }else{
                arr2.add(nums[i]);
                j++;
            }
         }
         k=0;
         for(int i=0;i<arr1.size();i++){
            nums[i]=arr1.get(i);
         }
         for(int i=arr1.size();i<(arr1.size()+arr2.size());i++){
            nums[i]=arr2.get(k++);
         }
         return nums;
    }
}