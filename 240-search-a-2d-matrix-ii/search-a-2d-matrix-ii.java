class Solution {
    public boolean binary(int[] arr,int t){
        int i=0,j=arr.length-1,mid;
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid]==t){
                return true;
            }else if(arr[mid]>t){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] i:matrix){
            if(binary(i,target)){
                return true;
            }
        }
        return false;
    }
}