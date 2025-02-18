class Solution {
    public int minimumSum(int[] nums) {
        int sum=0;
        int k1=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                if(nums[i]<nums[j]){
                    for(int k=j+1;k<n;k++){
                        if(nums[k]<nums[j]){
                            sum=nums[i]+nums[j]+nums[k];
                            k1=Math.min(k1,sum);
                        }
                    }
                }
            }
        }
        if(k1==Integer.MAX_VALUE)
        {
            return -1;
        }
        return k1;
        
    }
}