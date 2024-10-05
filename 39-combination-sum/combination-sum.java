class Solution {
    public void recursion(int[] arr,int i,int t,int sum,List<Integer> lst,List<List<Integer>> ret){
        if(sum>t){
            return;
        }
        if(i==arr.length){
            if(sum==t){
                ret.add(new ArrayList<>(lst));
            }
            return;
        }
        sum+=arr[i];
        lst.add(arr[i]);
        recursion(arr,i,t,sum,lst,ret);
        sum-=arr[i];
        lst.remove(lst.size()-1);
        recursion(arr,i+1,t,sum,lst,ret);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret=new ArrayList<>();
        recursion(candidates,0,target,0,new ArrayList<>(),ret);
        return ret;
    }
}