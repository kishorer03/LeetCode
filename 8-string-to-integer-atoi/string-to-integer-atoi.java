class Solution {
    public int myAtoi(String s) {
        int itr=0;
        while(itr<s.length() && s.charAt(itr)==' ') itr++;
        int sign=1;
        if(itr<s.length() && s.charAt(itr)=='-'){
            sign=-1;
            itr++;
        }else if(itr<s.length() && s.charAt(itr)=='+'){
            sign=1;
            itr++;
        }
        while(itr<s.length() && s.charAt(itr)=='0') itr++;
        long ans=0;
        while(itr<s.length()){
            char ch=s.charAt(itr);
            if(ch>='0' && ch<='9'){
                int digit=ch-'0';
                ans=ans*10+digit;
                if(ans>Integer.MAX_VALUE && sign==1){
                    return Integer.MAX_VALUE;
                }else if(ans>Integer.MAX_VALUE &&sign==-1) return Integer.MIN_VALUE;
            }else{
                break;
            }
            itr++;
        }
        return (int)(ans*sign);
        
    }
}