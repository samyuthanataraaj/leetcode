class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            int inc=(numRows-1)*2;
            for(int j=i;j<s.length();j+=inc){
                sb.append(s.charAt(j));
                if(i>0&&i<numRows-1&&(j+inc-2*i)<s.length()){
                    sb.append(s.charAt(j+inc-2*i));
                }
            }
            
        }
        return sb.toString();
        
    }
}