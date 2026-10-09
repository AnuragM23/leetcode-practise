class Solution {
    private char[][] grid;
    private int count;
    private int rows, cols;
    private void helper(int r, int c, int start){
        if(r<0 || r>=rows || c<0 || c>=cols || grid[r][c]=='0') return;

        if(start==0) this.count++;
        grid[r][c] = '0';
        helper(r-1, c, 1);
        helper(r+1, c, 1);
        helper(r, c-1, 1);
        helper(r, c+1, 1);
    }
    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.count = 0;
        this.rows = grid.length;
        this.cols = grid[0].length;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(grid[i][j] == '1') helper(i, j, 0);
            }
        }
        return count;
    }
}
