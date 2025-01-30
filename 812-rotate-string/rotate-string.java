class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if((goal.substring(i,goal.length())+goal.substring(0,i)).equals(s)){
                return true;
            }
        }
        return false;
    }
}