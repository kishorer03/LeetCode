class Solution {
    public void solve(int i,String num,long res,int target, long prev,String inner,List<String> lst){
        if(i==num.length()){
            if(res==target)
                lst.add(inner);
            return;
        }
        for(int temp=i;temp<num.length();temp++){
            long curr=Long.parseLong(num.substring(i,temp+1));
            if(i==0){
                solve(temp+1,num,curr,target,curr,inner+curr,lst);
            }else{
                solve(temp+1,num,res+curr,target,curr,inner+"+"+curr,lst);
                solve(temp+1,num,res-curr,target,-curr,inner+"-"+curr,lst);
                solve(temp+1,num,res-prev+prev*curr,target,prev*curr,inner+"*"+curr,lst);
            }
            if(temp==i && num.charAt(temp)=='0') break;
        }
    }
    public List<String> addOperators(String num, int target) {
        List<String> lst=new ArrayList<String>();
        if(num == null || num.length() == 0) return lst;
        solve(0,num,0,target,0,"",lst);
        return lst;
    }
}