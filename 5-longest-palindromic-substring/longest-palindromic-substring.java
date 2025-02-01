class Solution {
    public int fun(String s,int i,int j,int[][] dp){
        if(s.charAt(i)==s.charAt(j)){
            if(i+1==j || i==j){
                dp[i][j]=1;
                return j-i+1;
            }
            if(dp[i+1][j-1]==1){
                dp[i][j]=1;
                return j-i+1;
            }
        }
        return 0;
    }
    public String longestPalindrome(String s) {
        int count=0,x=0,y=0;
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(j+i>=s.length()){
                    break;
                }
                int temp=fun(s,j,j+i,dp);
                if(count<temp){
                    count=temp;
                    x=j;y=j+i;
                }
            }
        }
        return s.substring(x,y+1);
    }
}