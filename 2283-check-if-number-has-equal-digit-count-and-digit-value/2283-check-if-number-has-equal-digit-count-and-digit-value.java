class Solution {
    public boolean digitCount(String num) {
        int n = num.length();
        int[] freq = new int[10];
        for (int i = 0; i < n; i++) {
            int digit = num.charAt(i) - '0';
            freq[digit]++;
        }
        for (int i = 0; i < n; i++) {
            int expectedCount = num.charAt(i) - '0';
            if (freq[i] != expectedCount) {
                return false;
            }
        }
        return true;
    }
}

