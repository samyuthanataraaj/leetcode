class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        int op=0;
        for(int e:nums){
          sum+=e;
        }
        System.out.println(sum);
        while(sum%k!=0){
          sum-=1;
          System.out.println(sum);
          op++;
        }
        return op;
    }
}