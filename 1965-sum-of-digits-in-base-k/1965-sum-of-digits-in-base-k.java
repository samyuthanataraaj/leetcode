class Solution {
    public int sumBase(int n, int k) {
        int g=0;
        while(n>0){
            int r=n%k;
            g+=r;
            n/=k;

        }
        return g;
        
    }
}