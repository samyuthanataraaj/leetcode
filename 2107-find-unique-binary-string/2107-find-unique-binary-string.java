class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int k=nums[0].length();
        int n=(int)Math.pow(2,k);
        String arr[]=new String[n];

        for(int i=0;i<n;i++){
            
          
       String binary = String.format("%" + k + "s", Integer.toBinaryString(i)).replace(' ', '0');

        arr[i]=binary;


        }
      
        for(int i=0;i<n;i++){
            int l=1;
            for(int j=0;j<nums.length;j++){
              if(arr[i].equals(nums[j])){
                l=0;
                break;
                
              }
            }
            if(l!=0){
                return arr[i];
            }
        }
        return " ";
        
    }
}