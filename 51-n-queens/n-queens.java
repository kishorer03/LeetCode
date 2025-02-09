class Solution {
    public boolean isNotSafe(int r,int c,int[][] arr){
        int i=r,j=c;
        while(i>=0 && j>=0){
            if(arr[i--][j--]==1){
                return true;
            }
        }
        i=r;j=c;
        while(i>=0 && j<arr[0].length){
            if(arr[i--][j++]==1){
                return true;
            }
        }
        return false;
    }
    public void solve(int row,int n,int[] top,int[][] arr,List<List<String>> lst){
        if(row==n){
            List<String> dum=new ArrayList<String>(); 
            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++){
                    if(arr[i][j]==1){
                        sb.append('Q');
                    }else{
                        sb.append('.');
                    }
                }
                dum.add(sb.toString());
            }
            lst.add(dum);
            return;
        }
        for(int i=0;i<n;i++){
            if(top[i]==1 || isNotSafe(row,i,arr)){
                continue;
            }
            top[i]=1;
            arr[row][i]=1;
            solve(row+1,n,top,arr,lst);
            top[i]=0;
            arr[row][i]=0;
        }
    }
    public List<List<String>> solveNQueens(int n) {
        int[] top=new int[n];
        List<List<String>> lst=new ArrayList<List<String>>();
        solve(0,n,top,new int[n][n],lst);
        return lst;
    }
}