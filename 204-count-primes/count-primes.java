class Solution {
    public int countPrimes(int n) {
        int[] arr=new int[n];
        int count=0;
        for(int i=2;i*i<n;i++){
            if(arr[i]!=1){
                int j=i*i;
                while(j<n){
                    arr[j]=1;
                    j+=i;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]!=1) ++count;
        }
        return count;
    }
}