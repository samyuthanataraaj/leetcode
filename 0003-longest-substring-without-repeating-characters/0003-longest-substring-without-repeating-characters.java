import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (seen.contains(s.charAt(j))) {
                    break;
                } else {
                    seen.add(s.charAt(j));
                }
            }
            maxLength = Math.max(maxLength, seen.size());
        }
        return maxLength;
    }
}
