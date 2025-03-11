class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        int minRecolors = Integer.MAX_VALUE;

        for (int i = 0; i <= blocks.length() - k; i++) {
            int currentRecolors = 0;
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    currentRecolors++;
                }
            }
            minRecolors = Math.min(minRecolors, currentRecolors);
        }

        return minRecolors;
    }
}
