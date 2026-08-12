class Solution {
    public int[] findBall(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        int result[]=new int[cols];

        for(int startCol=0;startCol<cols;startCol++){
            int col=startCol;
            for(int row=0;row<rows;row++){
                if(grid[row][col]==1){
                    if(col+1>=cols || grid[row][col+1]==-1){
                        col=-1;
                        break;
                    }
                    col++;
                }else{
                    if(col-1<0 || grid[row][col-1]==1){
                        col=-1;
                        break;
                    }
                    col--;
                }
            }
            result[startCol]=col;
        }
        return result;
    }
}