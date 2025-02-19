class Solution {
    public String makeGood(String s) {
        //StringBuilder sb=new StringBuilder(s);
        int n=s.length();
        
        for(int i=0;i<n-1;i++){
            int k=Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
            if(k==32){
                return makeGood(s.substring(0,i)+s.substring(i+2));
            }
        }
        return s;
       
        
    }
}