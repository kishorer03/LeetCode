class Solution {
    public int longestSubarray(int[] nums) {
        int max=nums[0],continuous=0,temp=0;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println(max);
        for(int j=0;j<nums.length;j++){
            if(nums[j]==max){
                ++continuous;
                temp=continuous>temp?continuous:temp;
            }else{
                continuous=0;
            }
        }
        return temp;
    }
}