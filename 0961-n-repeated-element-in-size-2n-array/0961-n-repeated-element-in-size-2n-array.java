class Solution {
    public int repeatedNTimes(int[] nums) {
        int m=nums.length;
        int n=m/2;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
               if(nums[i]==nums[j]){
                return nums[i];
               }
            }
        }
        return 0;
        
    }
}