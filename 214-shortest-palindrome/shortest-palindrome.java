class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder str2=new StringBuilder(s);
        String out="";
        str2.reverse();
        int i=0;
        while(i<s.length()){
            if(s.startsWith(str2.substring(i))){
                out+=str2.substring(0,i);
                System.out.println(out);
                break;
            }
            ++i;
        }
        out+=s;
        return out;
    }
}