class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ret={-1,-1};
        int i=0,j=nums.length-1,mid;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                ret[0]=mid;
                j=mid-1;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        i=0;j=nums.length-1;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                ret[1]=mid;
                i=mid+1;
            }else if(nums[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ret;
    }
}