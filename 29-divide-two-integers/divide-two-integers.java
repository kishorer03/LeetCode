class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 0){
            return 0;
        }
        if(dividend == divisor){
            return 1;
        }
        boolean sign=true;
        if(dividend<0 && divisor>0) sign=false;
        if(dividend>=0 && divisor<0) sign=false;
        long a=Math.abs((long)dividend),b=Math.abs((long)divisor);
        long ans=0;
        while(a>=b){
            long pow=1;
            while(a-b*pow >=0){
                pow*=2;
            }
            ans+=pow>>1;
            a-=b*(pow>>1);
            if(ans>Integer.MAX_VALUE){
                return sign?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
        }
        int ret=(int)ans;
        return sign?ret:-1*ret;
    }
}