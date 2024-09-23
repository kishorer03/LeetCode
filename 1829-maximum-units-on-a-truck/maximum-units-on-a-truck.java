class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ret=0;
        Arrays.sort(boxTypes,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                if(a[1]>b[1]){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        for(int i=0;i<boxTypes.length;i++){
            if(boxTypes[i][0]>truckSize){
                ret+=(truckSize*boxTypes[i][1]);
                break;
            }
            ret+=(boxTypes[i][0]*boxTypes[i][1]);
            truckSize-=boxTypes[i][0];
        }
        return ret;
    }
}