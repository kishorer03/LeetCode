class Solution {
    public void recursion(int[] arr,int i,List<Integer> lst,int target,List<List<Integer>> ret){
        if(target==0){
            ret.add(new ArrayList<>(lst));
            return;
        }
        if(i==arr.length || target<0){
            return;
        }
        for(int j=i;j<arr.length;j++){
            if(j>i && arr[j-1]==arr[j]){
                continue;
            }
            lst.add(arr[j]);
            recursion(arr,j+1,lst,target-arr[j],ret);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ret=new ArrayList<>();
        Arrays.sort(candidates);
        recursion(candidates,0,new ArrayList<>(),target,ret);
        return ret;
    }
}