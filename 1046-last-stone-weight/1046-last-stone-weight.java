import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        return solve(stones);
    }

    public int solve(int[] stones) {
        Arrays.sort(stones);

        int n = stones.length;

        if (n == 0) return 0;
        if (n == 1) return stones[0];

        int x = stones[n - 2];
        int y = stones[n - 1];

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            list.add(stones[i]);
        }

        if (x != y) {
            list.add(y - x);
        }

        int[] next = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            next[i] = list.get(i);
        }

        return solve(next);
    }
}