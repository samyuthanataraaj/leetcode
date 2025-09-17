class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        String s1=(num>=0)?"":"-";
        String s="";
   
        
        int n=(int)Math.abs(num);
        int r=7;
        while(n>0){
            int k=n/7;
            r=n%7;
            s+=""+r;
           
            n=k;
        }
        String s2=new StringBuilder(s).reverse().toString();
        return s1+s2;
        
    }
}