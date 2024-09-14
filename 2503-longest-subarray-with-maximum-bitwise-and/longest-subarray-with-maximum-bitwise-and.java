class Solution {
    public int longestSubarray(int[] nums) {
        int max=nums[0],c=0,temp=0;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==max){
                ++c;
                temp=c>temp?c:temp;
            }else{
                c=0;
            }
        }
        return temp;
    }
}