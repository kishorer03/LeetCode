class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<Integer>();
        int[] mont=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            if(st.empty()){
                mont[i]=-1;
                st.push(nums2[i]);
            }else{
                while(st.size()>0 && st.peek()<=nums2[i]){
                    st.pop();
                }
                mont[i]=st.size()>0?st.peek():-1;
                st.push(nums2[i]);
            }
        }
        int[] out=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    out[i]=mont[j];
                    break;
                }
            }
        }
        return out;
    }
}