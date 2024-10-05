class Solution {
    public void recursion(int[] nums,int x,List<List<Integer>> ret,List<Integer> lst){
        ret.add(new ArrayList<>(lst));
        if(x==nums.length){
            return;
        }
        for(int i=x;i<nums.length;i++){
            lst.add(nums[i]);
            recursion(nums,i+1,ret,lst);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret=new ArrayList<>();
        recursion(nums,0,ret,new ArrayList<>());
        return ret;
    }
}