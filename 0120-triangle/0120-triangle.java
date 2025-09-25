class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        List<Integer> k = new ArrayList<>(triangle.get(n - 1)); // Start from last row

        for (int i = n - 2; i >= 0; i--) {
            List<Integer> r = new ArrayList<>(triangle.get(i));
            for (int j = 0; j < r.size(); j++) {
                int min = Math.min(k.get(j), k.get(j + 1));
                r.set(j, r.get(j) + min);
            }
            k = r; // Move up one row
        }

        return k.get(0); // Top element now holds the minimum path sum
    }
}
