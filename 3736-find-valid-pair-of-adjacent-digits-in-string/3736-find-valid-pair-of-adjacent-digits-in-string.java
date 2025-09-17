import java.util.HashMap;

class Solution {
    public String findValidPair(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            if (a != b &&
                freq.get(a) == a - '0' &&
                freq.get(b) == b - '0') {
                return "" + a + b;
            }
        }

        return "";
    }
}
