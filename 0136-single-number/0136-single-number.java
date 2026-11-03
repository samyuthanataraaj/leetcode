class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer, Integer> countMap = new HashMap<>();
        
        // for (int num : nums) {
        //     countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        // }
        
        // for (int num : nums) {
        //     if (countMap.get(num) == 1) {
        //         return num;
        //     }
        // }
        
        // return -1;
        int i=0;
        int ans=0;
        while(i<nums.length){
        ans^=nums[i];
        i++;
        }
       return ans;
    }
}