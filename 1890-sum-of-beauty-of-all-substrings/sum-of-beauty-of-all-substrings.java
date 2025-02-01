class Solution {
    public int beautySum(String s) {
        int ret=0;
        for(int i=0;i<s.length();i++){
            int[] arr=new int[26];
            int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
            for(int j=i;j<s.length();j++){
                int val=++arr[s.charAt(j)-'a'];
                max=max>val?max:val;
                min=max;
                for(int k=0;k<26;k++){
                    if(arr[k]>0){
                        min=min<arr[k]?min:arr[k];
                    }
                }
                ret+=(max-min);
            }
        }
        return ret;
    }
}