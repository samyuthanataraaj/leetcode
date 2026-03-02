public class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
      
        for (int layer = 0; layer < n - 1; layer++) {
            for (int i = 0; i < n - 1 - layer; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }
        return nums[0];
    }
}
