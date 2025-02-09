class Solution {
    public void solve(int digit,int i,String org,List<String> lst,StringBuilder str, String[] strarr){
        if(digit==org.length()){
            lst.add((new StringBuilder(str)).toString());
            return;
        }
        if(i==strarr[org.charAt(digit)-'0'].length()){
            return;
        }
        str.append(strarr[org.charAt(digit)-'0'].charAt(i));
        solve(digit+1,0,org,lst,str,strarr);
        str.deleteCharAt(str.length()-1);
        solve(digit,i+1,org,lst,str,strarr);
    }
    public List<String> letterCombinations(String digits) {
        
        String[] strarr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> lst=new ArrayList<String>();
        if(digits.equals("")){
            return lst;
        }
        solve(0,0,digits,lst,new StringBuilder(),strarr);
        return lst;
    }
}