class Solution {
    public int maxDistance(int[] colors) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<colors.length;i++){
            for(int j=0;j<colors.length;j++){
            if(i!=j&&colors[i]!=colors[j]){
                int k1=(int)Math.abs(i-j);
                if(max<k1){
                    max=k1;
                }
            }
            }
        }
        if(max==Integer.MIN_VALUE){
            return -1;
        }
        return max;
    }
}