class Solution {
    public int fun(String s,int i,int ret,boolean noDigit,int sym){
        if(i==s.length()){
            return ret*sym;
        }
        int ch=s.charAt(i)-'0';
        if(ch>=0 && ch<=9){
            noDigit=false;
                if(ret<=(Integer.MAX_VALUE-ch)/10){
                    ret*=10;
                    ret+=ch;
                    return fun(s,i+1,ret,noDigit,sym);
                }else{
                    return sym==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
        }else if(noDigit){
            if(s.charAt(i)==' '){
                return fun(s,i+1,ret,noDigit,sym);
            }else if(s.charAt(i)=='+'){
                return fun(s,i+1,ret,false,1);
            }else if(s.charAt(i)=='-'){
                return fun(s,i+1,ret,false,-1);
            }
        }
        return ret*sym;
    }
    public int myAtoi(String s) {
        return fun(s,0,0,true,1);
    }
}