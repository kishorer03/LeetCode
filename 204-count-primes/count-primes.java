class Solution {
    public int countPrimes(int n) {
        int[] arr=new int[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i]!=1){
                ++count;
                int j=2*i;
                while(j<n){
                    arr[j]=1;
                    j+=i;
                }
            } 
        }
        return count;
    }
}