class Solution {
    public int myAtoi(String s) {
        
        int i=0,max=Integer.MAX_VALUE,min=Integer.MIN_VALUE,sym=1;
        long ret=0;
        char[] arr=s.trim().toCharArray();
        if(arr.length==0){
            return 0;
        }
        if(arr[i]=='-' || arr[i]=='+'){
            sym=arr[i]=='-'?-1:1;
            i++;
        }
        
        while(i<arr.length){
            if(arr[i]>=48 && arr[i]<=57){
                ret=(ret*10)+(arr[i]-48);
                if(ret>max && sym==1){
                    return max;
                }
                if((long)max+1<ret && sym==-1){
                    return min;
                }
            }else{
                break;
            }
            i++;
        }
        return (int)ret*sym;
    }
}