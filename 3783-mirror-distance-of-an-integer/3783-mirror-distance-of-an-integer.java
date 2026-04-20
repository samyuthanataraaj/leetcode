class Solution {
    public int mirrorDistance(int n) {
        int k=reverse(n);
        return (int)Math.abs(n-k);
    }
    public int reverse(int n){
        while(n%10==0){
            n/=10;
        }
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        return sum;
    }
}