class Solution {
    // public int maxRotateFunction(int[] nums) {
    //     int max=Integer.MIN_VALUE;
    //     int n=nums.length;
    //     int i=0;
    //     while(i<n){
    //        int sum=0;
    //        int j=0;
    //        while(j<n){
    //         if(i!=0&&j==0){
    //            int temp=nums[0];
    //            int k=0;
    //            while(k<n-1){
    //             nums[k]=nums[k+1];
    //             k++;
    //            }
    //            nums[n-1]=temp;
    //         }
    //         sum+=j*nums[j];
    //         j++;
    //        }
           
    //        if(max<sum){
    //         max=sum;
    //        }
    //        i++;
    //     }
    //     return max;
    // }
    public int maxRotateFunction(int[] nums) {
    int n = nums.length;
    int totalSum = 0;
    int currVal = 0;

    // Compute totalSum and F(0)
    for (int i = 0; i < n; i++) {
        totalSum += nums[i];
        currVal += i * nums[i];
    }

    int max = currVal;

    // Compute F(1) to F(n-1)
    for (int k = 1; k < n; k++) {
        currVal = currVal + totalSum - n * nums[n - k];
        max = Math.max(max, currVal);
    }

    return max;
}

}