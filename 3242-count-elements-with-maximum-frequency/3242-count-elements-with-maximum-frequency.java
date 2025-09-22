class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        int arr[]=new int[nums[n-1]];
        for(int i=0;i<n;i++){
           arr[nums[i]-1]++;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
            max=arr[i];
           }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                count++;
            }
        }
        return max*count;
        
    }
}