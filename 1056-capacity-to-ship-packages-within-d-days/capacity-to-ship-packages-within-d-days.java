class Solution {
    public int fun(int[] weights,int d,int ans){
        int temp=ans,count=0;
        for(int i=0;i<weights.length;i++){
            if(temp-weights[i]<0){
                count++;
                temp=ans-weights[i];
            }else{
                temp-=weights[i];
            }
        }
        count++;
        return count<=d?1:-1;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum=0,max=-1;
        for(int i:weights){
            sum+=i;
            max=max>i?max:i;
        }
        int i=1,j=sum,mid,temp,ans=0;
        while(i<=j){
            mid=(i+j)/2;
            if(mid<max){
                i=mid+1;
                continue;
            }
            temp=fun(weights,days,mid);
            if(temp==1){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
}