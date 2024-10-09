class Solution {
    public void performFill(int[][] image,int org_val,int row,int col,int color){
        if(row<0 || col<0 || row==image.length || col==image[row].length || image[row][col]!=org_val){
            return;
        }
        image[row][col]=color;
        performFill(image,org_val,row-1,col,color);
        performFill(image,org_val,row+1,col,color);
        performFill(image,org_val,row,col-1,color);
        performFill(image,org_val,row,col+1,color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org_val=image[sr][sc];
        if(image[sr][sc]!=color){
            performFill(image,org_val,sr,sc,color);
        }
        return image;
    }
}