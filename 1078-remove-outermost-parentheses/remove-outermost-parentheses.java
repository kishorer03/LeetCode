class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ++count;
                if(count>1){
                    str.append(s.charAt(i));
                }
            }else{
                --count;
                if(count>0){
                    str.append(s.charAt(i));
                }
            }
        }
        return str.toString();
    }
}