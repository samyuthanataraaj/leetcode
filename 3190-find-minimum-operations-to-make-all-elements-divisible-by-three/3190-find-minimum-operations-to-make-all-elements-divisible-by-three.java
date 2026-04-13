class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int op=0;
        for(int i=0;i<n;i++){
           if(nums[i]%3==0){
            continue;
           }
           else{
            nums[i]-=1;
            if(nums[i]%3==0){
                op+=1;
            }
            else{
                nums[i]+=2;
                if(nums[i]%3==0){
                    op+=1;
                }
            }
           }
           
        }
        return op;
        
    }
}