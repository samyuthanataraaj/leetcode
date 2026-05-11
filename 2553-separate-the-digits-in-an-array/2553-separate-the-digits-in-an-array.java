class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            while(nums[i]>0){
                int r=nums[i]%10;
                l.add(r);
                nums[i]/=10;
            }
        }
        int arr[]=new int[l.size()];
        for(int i=l.size()-1,j=0;i>=0&&j<l.size();i--,j++){
            arr[j]=l.get(i);

        }
        return arr;
    }
}