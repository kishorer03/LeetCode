class Solution {
    public void solve(int[] arr,int i,int sum,int t,List<Integer> inner,List<List<Integer>> outer){
        if(i==arr.length || sum>t){
            return;
        }
        if(sum==t){
            outer.add(new ArrayList<Integer>(inner));
            return;
        }
        inner.add(arr[i]);
        solve(arr,i,sum+arr[i],t,inner,outer);
        inner.remove(inner.size()-1);
        solve(arr,i+1,sum,t,inner,outer);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lst= new ArrayList<List<Integer>>();
        solve(candidates,0,0,target,new ArrayList<Integer>(),lst);
        return lst;
    }
}