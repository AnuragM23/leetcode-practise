class Solution {
    private int ROW, COL;
    private int[][] grid;
    private Set<String> visited;

    private int helper(int r, int c){
        if(r<0 || r>=ROW || c<0 || c>=COL || grid[r][c]==0) return 1;
        if(visited.contains(r+","+c)) return 0;

        visited.add(r+","+c);
        return helper(r-1, c) + helper(r+1, c) + helper(r, c-1) + helper(r, c+1);
    }

    public int islandPerimeter(int[][] grid) {
        this.grid = grid;
        this.visited = new HashSet<>();
        this.ROW = grid.length;
        this.COL = grid[0].length;
        for(int i=0; i<ROW; i++) {
            for(int j=0; j<COL; j++) {
                if(grid[i][j] == 1){
                    return helper(i, j);
                }
            }
        }
        return 0;
    }
}