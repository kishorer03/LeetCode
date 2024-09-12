class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0,flag=0;
        for(int i=0;i<words.length;i++){
            flag=0;
            for(int j=0;j<words[i].length();j++){
                if(allowed.indexOf(words[i].charAt(j))==-1){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
            }
        }
        return count;
    }
}