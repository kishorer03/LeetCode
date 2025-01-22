class Solution {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1,mid;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<nums[j]){
                if(nums[mid]<target && target<=nums[j]){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }else{
                if(nums[i]<=target && target<nums[mid]){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }
        }
        return -1;
    }
}