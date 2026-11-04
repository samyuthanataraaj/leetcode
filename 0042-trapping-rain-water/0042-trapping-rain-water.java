class Solution {
    public int trap(int[] height) {
        // int sum=0;
        // if(height.length<=2){
        //     return 0;
        // }
        // int k=0;
        // if(height[0]==0){
        //     k=1;
        // }
        // for(int i=k;i<height.length;i+=2){
        //     if(i+1<height.length){
        //     sum+=(int)Math.abs(height[i]-height[i+1]);
        //     }
        // }
        // return sum+1;
        int n=height.length;
        int [] wl=new int[n];
        int[]  leftmax=new int[n];
        int[]  rightmax=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
           leftmax[i]=(int)Math.max(height[i],leftmax[i-1]);
        }
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=(int)Math.max(height[i],rightmax[i+1]);
        }
        for(int i=0;i<n;i++){
            wl[i]=(int)Math.min(leftmax[i],rightmax[i]);
        }
        int amountwater=0;
        for(int i=0;i<n;i++){
            int k=wl[i]-height[i];
            if(k>0){
                amountwater+=k;
            }
        }
        return amountwater;


    }
}