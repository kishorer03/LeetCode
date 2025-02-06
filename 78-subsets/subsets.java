class Solution {
    public void generate(List<Integer> inner,List<List<Integer>> outer,int i,int[] arr){
        if(i==arr.length){
            outer.add(new ArrayList<Integer>(inner));
            return;
        }
        inner.add(arr[i]);
        
        generate(inner,outer,i+1,arr);
        inner.remove(inner.size()-1);
        generate(inner,outer,i+1,arr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst=new ArrayList<List<Integer>>();
        generate(new ArrayList<Integer>(),lst,0,nums);
        return lst;
    }
}