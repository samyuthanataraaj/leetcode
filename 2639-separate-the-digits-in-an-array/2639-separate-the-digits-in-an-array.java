class Solution {
    public int[] separateDigits(int[] nums) {
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<nums.length;i++){
        sb.append(Integer.toString(nums[i]));
       }
       String h=sb.toString();
       int n=h.length();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=h.charAt(i)-'0';
       }
       return arr;
        
    }
}