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
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            mp.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            out[i]=mont[mp.get(nums1[i])];
        }
        return out;
    }
}