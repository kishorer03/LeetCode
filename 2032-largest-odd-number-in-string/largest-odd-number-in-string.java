class Solution {
    public String largestOddNumber(String num) {
        char[] arr=num.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            if((new Integer(arr[i]))%2!=0){
                return new String(arr,0,i+1);
            }
        }
        return "";
    }
}