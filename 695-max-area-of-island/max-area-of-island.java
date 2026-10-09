class Solution {
    private int[][] grid;
    private int rows, cols;
    private int helper(int r, int c) {
        if(r<0 || r>=rows || c<0 || c>=cols || grid[r][c]==0) return 0;

        grid[r][c] = 0;
        return 1 + helper(r-1, c) + helper(r+1, c) + helper(r, c-1) + helper(r, c+1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid[0].length;
        int maxi=0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(grid[i][j] == 1) maxi = Math.max(maxi, helper(i, j));
            }
        }
        return maxi;
    }
}
