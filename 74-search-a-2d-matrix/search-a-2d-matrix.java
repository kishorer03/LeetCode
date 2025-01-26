class Solution {
    public int binary2D(int[][] arr,int target){
        int i=0,j=arr.length-1,mid;
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid][0]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return j;
    }
    public boolean binary1D(int[] arr,int target){
        int i=0,j=arr.length-1,mid;
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int index=binary2D(matrix,target);
        return index<0?false:binary1D(matrix[index],target);
    }
}