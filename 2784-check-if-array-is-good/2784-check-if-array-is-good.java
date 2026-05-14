class Solution {
    public boolean isGood(int[] nums) {
        
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1){
            return false;
        }
        
        int k=nums[n-1];
        if(n<k){
            return false;
        }
        for(int i=0;i<n-2;i++){
            if(nums[i]==nums[i+1]){
                return false;
            }
            if(nums[i]!=i+1){
                return false;
            }
        }
        if(k==nums[n-2]){
        return true;
        }
        return false;
        
    }
}