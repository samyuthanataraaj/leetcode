class Solution {
    public int countOperations(int num1, int num2) {
        int op=0;
        if(num1==0||num2==0){
            return 0;
        }
        if(num1==num2){
            return 1;
        }
        
        while(num1>0||num2>0){
          if(num1<num2){
            num2-=num1;
            op++;
          }
          else if(num1>num2){
            num1-=num2;
            op++;
          }
          else{
            num1=0;
            num2=0;
            op++;
          }
        }
        return op;
        
    }
}