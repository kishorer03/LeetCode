class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int max=Integer.MIN_VALUE,index=0,n=nums.length;
        int[] ret=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];index=i;
            }
        }
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<nums.length;i++){
            while(st.size()>0 && st.peek()<=nums[(n+index)%n]){
                st.pop();
            }
            ret[(n+index)%n]=st.size()>0?st.peek():-1;
            st.push(nums[(n+index)%n]);
            index--;
        }
        return ret;
    }
}