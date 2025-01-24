class Solution {
    public int evaluate(int num,int[] piles,int h){
        // System.out.println(num);
        int index=0;
        for(int i:piles){
            index+=Math.ceil((double)i/num);
        }
        if(index<=h){
            return 1;
        }
        return -1;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=-1;
        
        for(int i:piles){
            max=max>i?max:i;
        }
        if(piles.length==h){
            return max;
        }
        // System.out.println(max);
        int i=1,j=max,mid,det,ans=Integer.MAX_VALUE;
        while(i<=j){
            mid=(i+j)/2;
            det=evaluate(mid,piles,h);
            if(det==1){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
}