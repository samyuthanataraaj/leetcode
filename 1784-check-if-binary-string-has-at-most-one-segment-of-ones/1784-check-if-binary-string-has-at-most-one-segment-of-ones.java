class Solution {
    public boolean checkOnesSegment(String s) {
        int n=s.length();
        int i=0;
        int k=0;
        int m=0;
        int k1=0;
        while(i<n){
            if(s.charAt(i)=='1'){
                k1++;
                if(m==0){
                    k++;
                }
            }
            else{
                m++;
            }
            i++;

        }
        if(k!=k1){
        return false;
        }
        return true;
    }
}