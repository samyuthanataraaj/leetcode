class Solution {
    public boolean isPerfectSquare(int num) {
        long sum=0;
        if(num <0) return false;
        for(long i=1;sum<num;i+=2){
            sum+=i;
            if(sum==num) return true;
        }
        return false;
    }
}