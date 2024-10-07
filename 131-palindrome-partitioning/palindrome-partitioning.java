class Solution {
    public boolean isPailn(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public void possibleSol(String s,List<List<String>> ret,List<String> temp){
        if(s.equals("")){
            ret.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<s.length();i++){
            if(isPailn(s.substring(0,i+1))){
                temp.add(s.substring(0,i+1));
                possibleSol(s.substring(i+1,s.length()),ret,temp);
                temp.remove(temp.size()-1);
            }
        }
        
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ret=new ArrayList<>();
        possibleSol(s,ret,new ArrayList<>());
        return ret;
    }
}