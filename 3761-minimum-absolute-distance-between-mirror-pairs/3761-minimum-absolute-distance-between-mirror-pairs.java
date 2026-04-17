import java.util.*;

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Deque<Integer>> map = new HashMap<>();

        // Build index queues
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayDeque<>()).add(i);
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int rev = reverse(nums[i]);

            if (!map.containsKey(rev)) continue;

            Deque<Integer> q = map.get(rev);

            // Remove indices <= i (we need j > i)
            while (!q.isEmpty() && q.peekFirst() <= i) {
                q.pollFirst();
            }

            if (!q.isEmpty()) {
                min = Math.min(min, q.peekFirst() - i);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public int reverse(int n) {
        if (n == 0) return 0;

        // remove trailing zeros
        while (n % 10 == 0) {
            n /= 10;
        }

        int re = 0;
        while (n > 0) {
            re = re * 10 + (n % 10);
            n /= 10;
        }
        return re;
    }
}