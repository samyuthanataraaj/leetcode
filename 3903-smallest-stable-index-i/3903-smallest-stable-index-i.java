class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int mini=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            int k1=0;
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            while(k1<=i){
                max=Math.max(nums[k1],max);
                k1++;
            }
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
            }
            int n=max-min;
            if(n<=k){
            index=i;
            mini=Math.min(mini,index);
            
            }  
        }
        if(mini!=Integer.MAX_VALUE){
            return mini;
        }
        return -1;    
    }
}