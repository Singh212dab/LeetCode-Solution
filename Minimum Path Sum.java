class Solution {
    public int minPathSum(int[][] grid) {
       int m = grid.length;
        int n = grid[0].length;
        int[][] mins = new int[m][n];
        mins[0][0] = grid[0][0];
        for (int i = 1; i < m; i ++){
            mins[i][0] = mins[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j ++){
            mins[0][j] = mins[0][j-1] + grid[0][j];
        }
        for (int i = 1; i < m ; i ++){
            for (int j = 1; j < n; j ++){
                 mins[i][j] = Math.min(mins[i-1][j], mins[i][j-1]) + grid[i][j];
            }
        }
        return mins[m-1][n-1];
    }
} 
    