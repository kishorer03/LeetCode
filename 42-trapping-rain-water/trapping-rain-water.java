class Solution {
    public int trap(int[] height) {
        int ret=0,l=0,r=height.length-1,lmax=height[l],rmax=height[r];
        while(l!=r){
            if(height[l]<=height[r]){
                ret+=Math.min(lmax,rmax)-height[l];
                l++;
            }else{
                ret+=Math.min(lmax,rmax)-height[r];
                r--;
            }
            lmax=Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
        }
        return ret;
    }
}