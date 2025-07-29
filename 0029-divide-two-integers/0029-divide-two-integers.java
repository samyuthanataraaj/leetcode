class Solution {
  public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE;
    }
    if(dividend==Integer.MAX_VALUE&&divisor==-1){
        return Integer.MIN_VALUE+1;
            }

    int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

    long dividend1 = Math.abs((long) dividend);
    long divisor1 = Math.abs((long) divisor);

    int quotient = 0;

    while (dividend1 >= divisor1) {
        dividend1 -= divisor1;
        quotient++;
    }

    return sign * quotient;
}

}