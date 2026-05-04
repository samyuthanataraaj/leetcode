class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return true;
        }
        int n=s.length();
        char g[]=goal.toCharArray();
        int i=0;
        while(i<n){
            char temp=g[0];
            for(int j=0;j<n-1;j++){
                g[j]=g[j+1];
            }
            g[n-1]=temp;

            String s1=String.valueOf(g);
            if(s.equals(s1)){
                return true;
            }
            i++;

        }
        return false;
        
    }
}