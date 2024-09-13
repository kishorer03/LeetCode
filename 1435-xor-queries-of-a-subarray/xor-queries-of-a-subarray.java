class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] res=new int[queries.length];
        int xor;
        for(int i=0;i<queries.length;i++){
            xor=arr[queries[i][0]];
            for(int j=queries[i][0]+1;j<=queries[i][1];j++){
                xor=xor^arr[j];
            }
            res[i]=xor;
        }
        return res;
    }
}