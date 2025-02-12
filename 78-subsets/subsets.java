class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer=new ArrayList<List<Integer>>();
        int len=1<<nums.length;
        for(int i=0;i<len;i++){
            List<Integer> inner=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){
                    inner.add(nums[j]);
                }
            }
            outer.add(inner);
        }
        return outer;
    }
}