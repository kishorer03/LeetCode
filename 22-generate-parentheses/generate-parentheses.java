class Solution {
    public void generate(StringBuilder sb,int n,int open,int close,List<String> lst){
        if(sb.length()==n){
            lst.add(sb.toString());
            return;
        }

        if(open<(n/2)){
            sb.append('(');
            generate(sb,n,open+1,close,lst);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            generate(sb,n,open,close+1,lst);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> lst=new ArrayList<String>();
        generate(new StringBuilder(),n*2,0,0,lst);
        return lst;
    }
}