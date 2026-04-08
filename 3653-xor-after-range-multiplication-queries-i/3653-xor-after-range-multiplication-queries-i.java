class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i=0;i<queries.length;i++){
            int s=queries[i][0];
            int e=queries[i][1];
            int ju=queries[i][2];
            int m=queries[i][3];
            for(int k=s;k<=e;k+=ju){
                nums[k] = (int)(((long) nums[k] * m) % 1_000_000_007);
            }
            
        }
        System.out.println(nums[0]);
        int d=nums[0];
        for(int i=1;i<nums.length;i++){
             d^=nums[i];
             d=d;
        }
        return d;
        
    }
}