class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
         int ROWS=grid.length; int COLS=grid[0].length;
        List<Integer> out = new ArrayList<>();
        int r = ROWS * COLS - 1;
        for (int i = 0; i <= r; i++) {
            int row = i/COLS;
            int col;
            if (row%2==0){
                col = i % COLS;
            } else {
                col = COLS-(i % COLS)-1;

            }
            i++;
            out.add(grid[row][col]);
        }
        return out;
    }
}