public class Solution {
    public int countBinarySubstrings(String s) {
        int prevRunLength = 0;
        int curRunLength = 1;
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curRunLength++;
            } else {
                prevRunLength = curRunLength;
                curRunLength = 1;
            }
            if (prevRunLength >= curRunLength) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "00110011";
        System.out.println("Count of binary substrings: " + solution.countBinarySubstrings(input)); // Expected output: 6
    }
}
