class Solution {
    public boolean possible(int i,int j,int num,char[][] board){
        for(int x=0;x<=8;x++){
            if(board[i][x]!='.' && board[i][x]-'0'==num){
                return false;
            }
        }
        for(int x=0;x<=8;x++){
            if(board[x][j]!='.' && board[x][j]-'0'==num){
                return false;
            }
        }
        int row=i/3,col=j/3;
        for(int x=0;x<=2;x++){
            for(int y=0;y<=2;y++){
                if(board[row*3+x][col*3+y]!='.' && board[row*3+x][col*3+y]-'0'==num){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean solve(int i,int j,int num,char[][] board){
        if(num==10){
            return false;
        }
        if(j==board[0].length){
            if(solve(i+1,0,1,board)){
                return true;
            }
            return false;
        }
        if(i==board.length){
            return true;
        }
        if(board[i][j]!='.'){
            if(solve(i,j+1,1,board)){
                return true;
            }
        }else{
            
            if(possible(i,j,num,board)){
                board[i][j]=(char)('0'+num);
                if(solve(i,j+1,1,board)){
                    return true;
                }
                board[i][j]='.';
            }
            if(solve(i,j,num+1,board)){
                return true;
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        solve(0,0,1,board);
    }
}