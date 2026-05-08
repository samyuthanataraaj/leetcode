class Solution {
    public int minOperations(String s) {
        char r=s.charAt(0);
        int i=0,j=0,count=0,countm=0;
        int n=s.length();
        if(r=='0'){
          while(i<n){
            if(i%2==0){
                if(s.charAt(i)!='0'){
                    count++;
                }
                else{
                    countm++;
                }
            }
            else{
              if(s.charAt(i)!='1'){
                count++;
              }
              else{
                    countm++;
                }  
            }
            i++;
          }  
        }
        else{
           while(j<n){
            if(j%2==0){
                if(s.charAt(j)!='1'){
                    count++;
                }
                else{
                    countm++;
                }
            }
            else{
              if(s.charAt(j)!='0'){
                count++;
              }
              else{
                    countm++;
                }  
            }
            j++;
          }
        }
        return (int)Math.min(count,countm);
       
}
}