class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=Integer.MIN_VALUE;
        while(r>l){
            int w=r-l;
            int h=min(height[r],height[l]);
            int area=h*w;
            if(max<area){
            max=area;
            }
            if(height[l]<height[r]){
            l++;
            }
            else if(height[l]>height[r]){
            r--;
            }
            else{
                l++;
                r--;
            }
        }
        return max;
    }
    public int min(int a,int b){
        int c=a<b? a:b;
        return c;

    }
    
        
        
}