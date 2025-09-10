class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++ ){
            if(nums[i]<10){
            sum1+=nums[i];
            }
            else{
                sum2+=nums[i];
            }
        }
        if(sum1==sum2&&sum2>=10){
            return false;
        }
        return true;
    }
}