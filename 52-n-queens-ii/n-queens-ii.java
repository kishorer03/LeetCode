class Solution {
    public int queenPuzzle(int n,int count,int col,boolean[] left,boolean[] leftbot,boolean[] leftabo){
        if(col==n){
            return count+1;
        }
        for(int i=0;i<n;i++){
            if(!(left[i] || leftbot[i+col] || leftabo[n-1+i-col])){
                left[i]=true;
                leftbot[i+col]=true;
                leftabo[i-col+n-1]=true;
                count=queenPuzzle(n,count,col+1,left,leftbot,leftabo);
                left[i]=false;
                leftbot[i+col]=false;
                leftabo[i-col+n-1]=false;
            }
        }
        return count;
    }
    public int totalNQueens(int n) {
        boolean[] left=new boolean[n];
        boolean[] leftbot=new boolean[2*n-1];
        boolean[] leftabo=new boolean[2*n-1];
        return queenPuzzle(n,0,0,left,leftbot,leftabo);
    }
}