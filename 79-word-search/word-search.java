class Solution {
    private int ROWS, COLS;
    private char[][] board;
    private String word;

    private boolean helper(int index, int r, int c){
        if(index == word.length()) return true;

        if(r<0 || c<0 || r>=ROWS || c>=COLS || board[r][c]=='#' || board[r][c]!=word.charAt(index)) return false;

        board[r][c] = '#';
        boolean res = helper(index+1, r+1, c) || helper(index+1, r-1, c) || helper(index+1, r, c-1) || helper(index+1, r, c+1);
        board[r][c] = word.charAt(index);
        return res;
    }

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        this.ROWS = board.length;
        this.COLS = board[0].length;

        for(int r=0; r<ROWS; r++) {
            for(int c=0; c<COLS; c++) {
                if(helper(0, r, c)) return true;
            }
        }
        return false;
    }
}
