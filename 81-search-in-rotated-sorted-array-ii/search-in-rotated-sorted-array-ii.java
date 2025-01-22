class Solution {
    public boolean search(int[] nums, int target) {
        int i=0,j=nums.length-1,mid;
        while(i<=j){
            mid=(i+j)/2;
            System.out.println(mid +" "+nums[mid]);
            if(nums[mid]==target){
                return true;
            }else if(nums[i]==nums[mid] && nums[mid]==nums[j]){
                ++i;--j;
                continue;
            }
            else if(nums[mid]<=nums[j]){
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
        return false;       
    }
}