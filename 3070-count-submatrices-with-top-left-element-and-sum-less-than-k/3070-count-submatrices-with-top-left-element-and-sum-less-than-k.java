class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = grid[i][j];
                if (i > 0) arr[i][j] += arr[i - 1][j];
                if (j > 0) arr[i][j] += arr[i][j - 1];
                if (i > 0 && j > 0) arr[i][j] -= arr[i - 1][j - 1];
                if (arr[i][j] <= k) {
                    count++;
                }
            }
        }
        return count;
    }
}