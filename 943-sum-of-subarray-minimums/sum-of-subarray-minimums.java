class Solution {
    public void nextSmallest(Stack<Integer> st_val,Stack<Integer> st_in,int[] arr,int[] ret){
        for(int i=arr.length-1;i>=0;i--){
            while(st_val.size()>0 && arr[i]<=st_val.peek()){
                st_val.pop();
                st_in.pop();
            }
            ret[i]=st_in.size()>0?st_in.peek():arr.length;
            st_val.push(arr[i]);
            st_in.push(i);
        }
    }
    public void prevSmallest(Stack<Integer> st_val,Stack<Integer> st_in,int[] arr,int[] ret){
        for(int i=0;i<arr.length;i++){
            while(st_val.size()>0 && arr[i]<st_val.peek()){
                st_val.pop();
                st_in.pop();
            }
            ret[i]=st_in.size()>0?st_in.peek():-1;
            st_val.push(arr[i]);
            st_in.push(i);
        }
    }
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st_val=new Stack<Integer>();
        Stack<Integer> st_in=new Stack<Integer>();
        int[] next=new int[arr.length],prev=new int[arr.length];
        nextSmallest(st_val,st_in,arr,next);
        st_val=new Stack<Integer>();
        st_in=new Stack<Integer>();
        prevSmallest(st_val,st_in,arr,prev);
        // for(int i:next){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // for(int i:prev){
        //     System.out.print(i+" ");
        // }
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=(((long)(i-prev[i])*(long)(next[i]-i))%(1000000007))*arr[i];
            sum%=1000000007;
        }
        return (int)sum;
    }
}