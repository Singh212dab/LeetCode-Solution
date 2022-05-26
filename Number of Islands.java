class Solution {
    public int numIslands(char[][] grid) {
       if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m ; i ++) {
            for (int j = 0; j < n; j ++) {
                if (grid[i][j] == '1') {
                    count ++;
                    df(grid, m, n, i, j);
                }
            }
        }
        return count;
    }
    private void df(char[][] grid, int m, int n, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = 'X';
        df(grid, m, n, i - 1, j);
        df(grid, m, n, i + 1, j);
        df(grid, m, n, i, j - 1);
        df(grid, m, n, i, j + 1);
    }
} 
 