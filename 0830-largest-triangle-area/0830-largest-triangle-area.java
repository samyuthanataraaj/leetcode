class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    int[] A = points[i];
                    int[] B = points[j];
                    int[] C = points[k];
                    double area = 0.5 * Math.abs(
                        (B[0] - A[0]) * (C[1] - A[1]) -
                        (C[0] - A[0]) * (B[1] - A[1])
                    );
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
}
