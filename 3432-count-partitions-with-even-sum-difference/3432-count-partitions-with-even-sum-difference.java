class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int sum1=0;
            int sum2=0;
            for(int j=0;j<=i;j++){
                sum1+=nums[j];
            }
            for(int k=i+1;k<n;k++){
                    sum2+=nums[k];
            }
            System.out.println(sum1+" "+sum2);
            int sub=sum1-sum2;
            if(sub%2==0){
                count++;
            }
        }
        return count;
    }
}