class Solution {
    public void recursion(int[] arr,int x,List<Integer> lst,List<List<Integer>> ret){
        ret.add(new ArrayList<>(lst));
        if(x==arr.length){
            return;
        }
        for(int i=x;i<arr.length;i++){
            if(i>x && arr[i]==arr[i-1]){
                continue;
            }
            lst.add(arr[i]);
            recursion(arr,i+1,lst,ret);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ret=new ArrayList<>();
        Arrays.sort(nums);
        recursion(nums,0,new ArrayList<>(),ret);
        return ret;
    }
}