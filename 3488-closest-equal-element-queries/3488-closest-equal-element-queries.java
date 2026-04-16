class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> answer = new ArrayList<>();
        for (int q : queries) {
            List<Integer> indices = map.get(nums[q]);

            if (indices.size() == 1) {
                answer.add(-1);
                continue;
            }

            int pos = Collections.binarySearch(indices, q);
            int size = indices.size();

            int prev = indices.get((pos - 1 + size) % size);
            int next = indices.get((pos + 1) % size);

            int dist1 = Math.abs(q - prev);
            int dist2 = Math.abs(q - next);
            dist1 = Math.min(dist1, n - dist1);
            dist2 = Math.min(dist2, n - dist2);

            answer.add(Math.min(dist1, dist2));
        }

        return answer;
    }
}