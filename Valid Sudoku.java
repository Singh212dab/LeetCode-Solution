class Solution {
    public boolean isValidSudoku(char[][] board) {
      Set<Character> helper = new HashSet<Character>();
        for (int i = 0;i < board.length; i ++) {
            helper.clear();
            for (int j = 0; j < board.length; j ++) {
                if (process(helper, board[i][j]) == false)
                    return false;
            }
        }
        for (int j = 0;j < board.length; j ++) {
            helper.clear();
            for (int i = 0; i < board.length; i ++) {
                if (process(helper, board[i][j]) == false)
                    return false;
            }
        }
        for(int i = 0; i<9; i+= 3){
            for(int j = 0; j<9; j+= 3){
                helper.clear();
                for(int k = 0; k<9; k++){
                    if(!process(helper, board[i + k/3][ j + k%3]))
                        return false;                   
                }
            }
        }

        return true;
    }
    private boolean process(Set<Character> helper, char c) {
        if (c == '.') {
            return true;
        }
        if (helper.contains(c)) {
            return false;
        }
        helper.add(c);
        return true;
    }
}  