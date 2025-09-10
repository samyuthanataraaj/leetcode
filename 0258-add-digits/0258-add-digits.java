class Solution {
    public int addDigits(int num) {
        String s=String.valueOf(num);
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        if(sum==0){
            return 0;
        }
        int k=(int)Math.floor(Math.log10(sum))+1;
        if(k==1){
            return sum;
        }
        else{
            return addDigits(sum);
        }
        
    }
}