class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=sum>max?sum:max;
            sum=sum<0?0:sum;
        }
        return max;
    }
}