class Solution {
    public int smallestIndex(int[] nums) {
    int min=Integer.MAX_VALUE;
    for(int i=0;i<nums.length;i++){
        int k=nums[i];
        int sum=0;
        while(k>0){
            int r=k%10;
            sum+=r;
            k/=10;
        }
        if(sum==i){
            if(min>sum){
                min=sum;
            }
        }
     }
     if(min!=Integer.MAX_VALUE){
        return min;
     }
     return -1;
     
    }
}