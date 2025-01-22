class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1,mid,min=Integer.MAX_VALUE;
        while(i<=j){
            mid=(i+j)/2;            
            if(nums[mid]<nums[j]){
                min=min<nums[mid]?min:nums[mid];
                j=mid-1;
            }else{
                min=min<nums[i]?min:nums[i];
                i=mid+1;
            }
        }
        return min;
    }
}