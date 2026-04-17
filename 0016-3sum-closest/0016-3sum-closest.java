class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int n1=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    int sub=Math.abs(sum - target);
                    if(min>sub){
                        min=sub;
                        n1=sum;
                    }
                }
            }
        }
        return n1;
        
    }
}