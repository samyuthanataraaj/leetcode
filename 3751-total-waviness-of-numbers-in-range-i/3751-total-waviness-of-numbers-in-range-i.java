class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int j=num1;j<=num2;j++){
            String s=""+j;
            for(int i=1;i<s.length()-1;i++){
                int k=s.charAt(i)-'0';
                int p=s.charAt(i-1)-'0';
                int v=s.charAt(i+1)-'0';
                if(k>p&&k>v){
                    count++;
                }
                else if(k<p&&k<v){
                    count++;
                }
            }
        }
        return count;
        
    }
}