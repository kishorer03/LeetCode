class Solution {
    public int fun(int[] bloomDay,int m,int k,int ans){
        int count=0,times=0;
        for(int i=0;i<bloomDay.length;i++){
            if(ans>=bloomDay[i]){
                ++count;
                if(count==k){
                times++;
                count=0;
                }
            }else{
                count=0;
            }  
        }
        return times>=m?1:-1;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        // if(m*k>bloomDay.length){
        //     return -1;
        // }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i:bloomDay){
            min=min<i?min:i;
            max=max>i?max:i;
        }
        int i=min,j=max,mid,ret=0,ans=-1;
        while(i<=j){
            mid=(i+j)/2;
            ret=fun(bloomDay,m,k,mid);
            if(ret==1){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
}