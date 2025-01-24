class Solution {
    public int fun(int[] nums,int t,int ans){
        int temp=0;
        for(int i:nums){
            temp+=Math.ceil((double)i/ans);
        }
        return temp<=t?1:-1;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=max>i?max:i;
        }
        int i=1,j=max,mid,inter,ans=0;
        while(i<=j){
            mid=(i+j)/2;
            inter=fun(nums,threshold,mid);
            if(inter==1){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
}