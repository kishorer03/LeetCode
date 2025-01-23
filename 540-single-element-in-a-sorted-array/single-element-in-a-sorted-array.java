class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0,j=nums.length-1,mid,ise;
        while(i<=j){
            mid=(i+j)/2;
            ise=mid-i;
            if(i==j){
                return nums[j];
            }
            if(ise%2==0){
                if(nums[mid]==nums[mid+1]){
                    i=mid+2;
                }else if(nums[mid]==nums[mid-1]){
                    j=mid-2;
                }else{
                    return nums[mid];
                }
            }else{
                if(nums[mid]==nums[mid+1]){
                    j=mid-1;
                }else if(nums[mid]==nums[mid-1]){
                    i=mid+1;
                }else{
                    return nums[mid];
                }
            }
        }
        return -1;
    }
}