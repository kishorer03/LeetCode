class Solution {
    public int fun(int[] nums,int k,int ans){
        int count=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>ans){
                ++count;
                sum=nums[i];
            }
        }
        ++count;
        System.out.println(count);
        if(count<=k){
            return 0;
        }else{
            return -1;
        }
    }
    public int splitArray(int[] nums, int k) {
        int i=Integer.MIN_VALUE,j=0,mid,ret=0,temp;
        if(k>nums.length){
            return -1;
        }
        for(int kk:nums){
            j+=kk;
            i=i>kk?i:kk;
        }
        while(i<=j){
            mid=(i+j)/2;
            temp=fun(nums,k,mid);
            if(temp==0){
                ret=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ret;
    }
}