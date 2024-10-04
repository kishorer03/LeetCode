class Solution {
    public void recursion(int[] candidates, int target, int i, List<Integer> lst, List<List<Integer>> ret, int sum) {
        if (sum == target) {
            ret.add(new ArrayList<>(lst));
            return;
        }
        if (sum > target || i == candidates.length) {
            return;
        }
        
        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }
            
            lst.add(candidates[j]);
            recursion(candidates, target, j + 1, lst, ret, sum + candidates[j]);
            lst.remove(lst.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(candidates);
        recursion(candidates, target, 0, new ArrayList<>(), ret, 0);
        return ret;
    }
}
