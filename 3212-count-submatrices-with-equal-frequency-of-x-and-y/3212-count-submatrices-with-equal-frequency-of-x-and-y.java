class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int n = grid.length, m = grid[0].length;
        int[][] pxX = new int[n + 1][m + 1];
        int[][] pxY = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int isX = (grid[i][j] == 'X') ? 1 : 0;
                int isY = (grid[i][j] == 'Y') ? 1 : 0;
                pxX[i + 1][j + 1] = pxX[i + 1][j] + pxX[i][j + 1] - pxX[i][j] + isX;
                pxY[i + 1][j + 1] = pxY[i + 1][j] + pxY[i][j + 1] - pxY[i][j] + isY;
            }
        }

        int ans = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                int countX = pxX[r + 1][c + 1];
                int countY = pxY[r + 1][c + 1];
                if (countX == countY && countX > 0) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
