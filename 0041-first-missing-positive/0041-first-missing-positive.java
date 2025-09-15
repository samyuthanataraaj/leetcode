class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int k=1;
        int h=nums[n-1];
        for(int i=0;i<n;i++){
            if(nums[i]==1){
               k=0;
               break;
            }
        }
        if(k==1){
          return 1;
        }
        
        for(int i=0;i<n-1;i++){
            if(nums[i]>0){
               
        
                if(nums[i]+1!=nums[i+1]&&nums[i]!=nums[i+1]){

                    return nums[i]+1;
                }
                
            }
        }
        
        return h+1;
        
    }
}