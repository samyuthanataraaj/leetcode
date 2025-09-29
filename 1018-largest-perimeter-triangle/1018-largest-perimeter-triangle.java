class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                   if(nums[i]+nums[j]>nums[k]){
                    sum=nums[i]+nums[j]+nums[k];
                    break;
                   } 
                }
            }
        }
        return sum;
        
    }
}