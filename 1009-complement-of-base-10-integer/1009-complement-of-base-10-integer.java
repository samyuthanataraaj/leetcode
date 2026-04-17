class Solution {
    public int bitwiseComplement(int n) {
      StringBuilder sb=new StringBuilder();
      if(n==0){
        return 1;
      }
      while(n>0){
        int k=n%2;
        if(k==0){
        sb.append(1);
        }
        else{
            sb.append(0);
        }
        n/=2;
      }
      String s=sb.reverse().toString();
      System.out.println(s);
      int n1 = 0;
      for (int i = 0; i < s.length(); i++) {
        n1 = n1 * 2 + (s.charAt(i) - '0');
    }
    return n1;

    }
}