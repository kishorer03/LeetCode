class Solution {
    public boolean check(int[] nums) {
        int count=0,max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                max=i+1;
                break;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[(max+i)%nums.length]>nums[(max+i+1)%nums.length]){
                return false;
            }
        }
        return true;
    }
}