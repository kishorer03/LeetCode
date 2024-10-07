class Solution {
    public void possibleQueens(char[][] board,int n,int col,List<List<String>> ret,boolean[] left,boolean[] leftbot,boolean[] leftabo){
        if(col==n){
            List<String> str=new ArrayList<>();
            for(char[] ch:board){
                str.add(new String(ch));
            }
            ret.add(str);
            return;
        }
        for(int i=0;i<n;i++){
            if(!(left[i] || leftbot[i+col] || leftabo[n-1+i-col])){
                left[i]=true;leftbot[i+col]=true;
                leftabo[n-1+i-col]=true;
                board[i][col]='Q';
                possibleQueens(board,n,col+1,ret,left,leftbot,leftabo);
                left[i]=false;leftbot[i+col]=false;leftabo[n-1+i-col]=false;
                board[i][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ret=new ArrayList<>();
        char[][] board=new char[n][n];
        boolean[] left=new boolean[n];
        boolean[] leftbot=new boolean[2*n-1];
        boolean[] leftabo=new boolean[2*n-1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        possibleQueens(board,n,0,ret,left,leftbot,leftabo);
        return ret;
    }
}