class Solution {
private int[][] directions = {{-1, 1}, {0, 1}, {1, 1}};
    private int[][] memo;

    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        memo = new int[m][n];
        int maxMoves = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
        for (int i = 0; i < m; i++) {
            maxMoves = Math.max(maxMoves, dfs(grid, i, 0));
        }

        return maxMoves;
    }

    private int dfs(int[][] grid, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;

        if (memo[row][col] != -1) {
            return memo[row][col];
        }

        int maxMove = 0;
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if (newRow >= 0 && newRow < m && newCol < n && grid[newRow][newCol] > grid[row][col]) {
                maxMove = Math.max(maxMove, 1 + dfs(grid, newRow, newCol));
            }
        }
        memo[row][col] = maxMove;
        return maxMove;    
    }
}