class Solution {
    private int[][] heights;
    private int[][] pacificPosibility;
    private int[][] atlanticPosibility;
    private void pacificTraversal(int r, int c, int height) {
        if(r<0 || r>=heights.length || c<0 || c>=heights[0].length || pacificPosibility[r][c]==1 || heights[r][c]<height) return;
        pacificPosibility[r][c] = 1;
        pacificTraversal(r-1, c, heights[r][c]);
        pacificTraversal(r+1, c, heights[r][c]);
        pacificTraversal(r, c-1, heights[r][c]);
        pacificTraversal(r, c+1, heights[r][c]);
    }
    private void atlanticTraversal(int r, int c, int height) {
        if(r<0 || r>=heights.length || c<0 || c>=heights[0].length || atlanticPosibility[r][c] == 1 || heights[r][c]<height) return;
        atlanticPosibility[r][c] = 1;
        atlanticTraversal(r-1, c, heights[r][c]);
        atlanticTraversal(r+1, c, heights[r][c]);
        atlanticTraversal(r, c-1, heights[r][c]);
        atlanticTraversal(r, c+1, heights[r][c]);
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights = heights;
        this.pacificPosibility = new int[heights.length][heights[0].length];
        this.atlanticPosibility = new int[heights.length][heights[0].length];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<heights.length; i++) {
            pacificTraversal(i, 0, 0);
            atlanticTraversal(i, heights[0].length-1, 0);
        }

        for(int i=0; i<heights[0].length; i++) {
            pacificTraversal(0, i, 0);
            atlanticTraversal(heights.length-1, i, 0);
        }

        for(int i=0; i<heights.length; i++) {
            for(int j=0; j<heights[0].length; j++) {
                if(pacificPosibility[i][j]==1 && atlanticPosibility[i][j]==1){
                    ans.add(new ArrayList<>(Arrays.asList(i, j)));
                } 
            }
        }

        return ans;
    }
}
