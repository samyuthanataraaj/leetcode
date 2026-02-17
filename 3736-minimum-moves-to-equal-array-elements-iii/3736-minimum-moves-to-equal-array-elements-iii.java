class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int k=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<k){
                int r=k-nums[i];
                count+=r;
            }
        }
        return count;
        
    }
}