class Solution {
    public int lengthOfLastWord(String s) {
        String s1[]=s.split(" ");
        // int max=Integer.MIN_VALUE;
        for(int i=s1.length-1;i>=0;i--){
            if(s1[i]==" "){
                continue;
            }
            else{
            String k=s1[i].replaceAll("//s","");
            return k.length();
          
            }
        }
        return 0;
    }
}
