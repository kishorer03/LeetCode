class Solution {
    public boolean isValid(String s) {
        int head=-1;
        char[] arr=new char[(s.length()/2)+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                if(head>=s.length()/2)
                    return false;
                arr[++head]=s.charAt(i);
                continue;
            }else if(s.charAt(i)==')' ){
                if(head>=0){
                    if(arr[head]=='('){
                        --head;
                        continue;
                        }
                    
                }
                    return false;
            }
            else if(s.charAt(i)==']' ){
                if(head>=0){
                    if(arr[head]=='['){
                        --head;
                        continue;
                        }
                }
                return false;
            }
                else if(s.charAt(i)=='}' ){
                if(head>=0){
                    if(arr[head]=='{'){
                        --head;
                        continue;
                        }
                }
                return false;
                }
        }
        return  head==-1?true:false;
    }
}