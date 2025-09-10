import java.math.BigInteger;
class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            int k1=(int)s.charAt(i)-96;
            sb.append(String.valueOf(k1));
        }
        String h=sb.toString();
        System.out.println(h);
        int i=0;
        int sum=0;
        
        while(i<k){
            sum=0;
            for(int j=0;j<h.length();j++){
                int p=h.charAt(j)-'0';
                sum+=p;
            }
            i++;
            h=String.valueOf(sum);
            System.out.println(h);
            
        }
        
         return sum;
    }
}