class Solution {
    private char[][] board;
    private int row, col;
    private void helper(int r, int c) {
        if(r<0 || r>=row || c<0 || c>=col || board[r][c]!='O') return;

        board[r][c] = 'T';
        helper(r-1, c);
        helper(r+1, c);
        helper(r, c-1);
        helper(r, c+1);
    }
    public void solve(char[][] board) {
        this.board = board;
        this.row = board.length;
        this.col = board[0].length;

        for(int i=0; i<col; i++) {
            if(board[0][i] == 'O') helper(0, i);
            if(board[row-1][i] == 'O') helper(row-1, i);
        }

        for(int i=0; i<row; i++) {
            if(board[i][0] == 'O') helper(i, 0);
            if(board[i][col-1] == 'O') helper(i, col-1);
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if(board[i][j] == 'T') board[i][j] = 'O';                
            }
        }
    }
}
