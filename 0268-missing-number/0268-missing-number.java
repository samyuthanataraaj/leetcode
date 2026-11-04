class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // int k=nums[n-1];
        // int arr[]=new int[k+1];
        // for(int i=0;i<k+1;i++){
        //   arr[i]=i;
        //   System.out.print(arr[i]+" ");
        // }
        // for(int i=0;i<n;i++){
            
        //       if(arr[i]!=nums[i]){
        //         return arr[i];
        //       }
            
        // }
        // return n;
        int n=nums.length;
        int k=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            k-=nums[i];
        }
        return k;
        
    }
}