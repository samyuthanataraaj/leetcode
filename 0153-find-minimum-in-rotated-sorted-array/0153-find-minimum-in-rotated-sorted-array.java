class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        while(i<n){
        // Arrays.sort(nums);
        // return nums[0];
        if(min>nums[i]){
            min=nums[i];
           
        }
         i++;
        }
        return min;
    }

}