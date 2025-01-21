class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1,mid=0;
        while(i<=j){
            mid=(i+j+2)/2;
            if(i==j){
                if(nums[i]>=target){
                    return i;
                }
                return i+1;
            }
            if(nums[mid-1]>=target){
                j=mid-1;
            }else if(nums[mid]>=target){
                return mid;
            }else{
                i=mid+1;
            }
        }
        return j+1;
    }
}