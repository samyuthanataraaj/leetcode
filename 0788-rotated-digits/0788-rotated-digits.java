class Solution {
    public int rotatedDigits(int n) {
       int i=1;
       int count=0;
       while(i<=n){
        if(i<=10){
            if(i==2||i==5||i==6||i==9){
               count++;
            }
        }
        else{
            System.out.print(i+" ");
            boolean s=rotate(i);
            System.out.println(s);
            if(s==true) count++;
        }
        i++;
       }
       return count;
        
    }
    public boolean rotate(int n){
        
        boolean s=false;
        while(n>0){
            int d=n%10;

            if(d==3||d==4||d==7){
                return false;
            }
            if (d == 2 || d == 5 || d == 6 || d == 9) {
            s= true; // rotation changes number
        }
            
            n/=10;
        }



        return s;
    }
    
}