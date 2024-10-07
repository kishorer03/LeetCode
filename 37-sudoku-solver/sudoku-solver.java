class Solution {
    public boolean valid(char[][] board,int row,int col,char num){
        for(int i=0;i<9;i++){
            if(board[row][i]==num || board[i][col]==num){
                return false;
            }
            if(board[((row/3)*3+(i/3))][((col/3)*3+(i%3))]==num){
                return false;
            }
        }
        return true;
    }
    public boolean fillSudoku(char[][] board,int row,int col){
        if(row==9){
            return true;
        }
        if(col==9){
            return fillSudoku(board,row+1,0);
        }
        if(board[row][col]!='.'){
            return fillSudoku(board,row,col+1);
        }
        for(int i=1;i<=9;i++){
            if(valid(board,row,col,(char)(i+'0'))){
                board[row][col]=(char)(i+'0');
                if(fillSudoku(board,row,col+1)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        fillSudoku(board,0,0);
    }
}