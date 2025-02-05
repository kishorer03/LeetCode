class Solution {
    public double Powerfun(double x,long n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        double half=Powerfun(x,n/2);
        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }
    public double myPow(double x, int n) {
        return n>=0?Powerfun(x,n):(1/Powerfun(x,(long)n*-1));
    }
}