class Solution {
    public void reverseS(StringBuilder str,int i,int j){
        char temp;
        while(i<j){
            temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
            i++;j--;
        }
        // return 
    }
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder(s);
        reverseS(str,0,str.length()-1);
        int i=0,j=0;
        while(j<str.length() && i<str.length()){
            if(str.charAt(i)!=' '){
                j=i;
                while(true){
                    if(j<str.length() && str.charAt(j)!=' '){
                        j++;
                    }else{
                        break;
                    }
                }
                reverseS(str,i,j-1);
                i=j;
            }
            i++;
        }
        StringBuilder str2=new StringBuilder();
        int count=0;
        for(int k=0;k<str.length();k++){
            if(str2.length()==0 && str.charAt(k)==' '){

            }else{
                if(str.charAt(k)==' '){
                    ++count;
                    if(count==1){
                        str2.append(str.charAt(k));
                    }
                }else{
                    count=0;
                    str2.append(str.charAt(k));
                }
            }
        }
        if(str2.charAt(str2.length()-1)==' '){
            str2.deleteCharAt(str2.length()-1);
        }
        return str2.toString();
    }
}