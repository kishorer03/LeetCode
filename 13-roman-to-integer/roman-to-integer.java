class Solution {
    public int romanToInt(String s) {
        int ret=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='I'){
                if(i==s.length()-1 || (s.charAt(i+1)!='V' && s.charAt(i+1)!='X')){
                    ret+=1;
                }else if(s.charAt(i+1)=='V'){
                    ret+=4;
                    i++;
                }else if(s.charAt(i+1)=='X'){
                    ret+=9;
                    i++;
                }
            }else if(ch=='V'){
                ret+=5;
            }else if(ch=='X'){
                if(i==s.length()-1 || (s.charAt(i+1)!='L' && s.charAt(i+1)!='C')){
                    ret+=10;
                }else if(s.charAt(i+1)=='L'){
                    ret+=40;
                    i++;
                }else if(s.charAt(i+1)=='C'){
                    ret+=90;
                    i++;
                }
            }else if(ch=='L'){
                ret+=50;
            }
            else if(ch=='C'){
                if(i==s.length()-1 || (s.charAt(i+1)!='D' && s.charAt(i+1)!='M')){
                    ret+=100;
                }else if(s.charAt(i+1)=='D'){
                    ret+=400;
                    i++;
                }else if(s.charAt(i+1)=='M'){
                    ret+=900;
                    i++;
                }
            }else if(ch=='D'){
                ret+=500;
            }else if(ch=='M'){
                ret+=1000;
            }
        }
        return ret;
    }
}