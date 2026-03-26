class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //potimal sort + two pinter
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];//2
        for(int i=0;i<nums.length;i++){
            //i=0 l = 1 r = 3
            //i=1  l =2 r =3
            //i=2 l=3 r=3
            int l =i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r]; //2 -3 //-1
                if(Math.abs(target-sum)<Math.abs(target-closest)){
                    //1<1x   4<1   2<1
                    closest= sum;
                }
                if(sum<target) l++; //l=2 r=2x l =3
                else if(sum>target)r--;//l=1 r=2 //i=0
                else return sum;
            }
        }
    
    return closest;//2ans
}
   
}