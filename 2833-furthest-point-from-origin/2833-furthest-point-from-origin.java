class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int k=0;
        int max=0;
        char[] c=moves.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='L'){
                k--;
            }
            else if(c[i]=='R'){
                k++;
                
            }
            else{
                max++;
                
            }
        }
        int r=(int)Math.abs(k)+max;
        return r;
    }
}