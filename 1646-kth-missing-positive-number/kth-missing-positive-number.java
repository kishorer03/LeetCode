class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i:arr){
            if(k<i){
                return k;
            }
            ++k;
        }
        return k;
    }
}