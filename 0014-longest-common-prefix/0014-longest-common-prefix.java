class Solution {
    public String longestCommonPrefix(String[] strs) {

        String s="";
        int n=strs.length;
        int min=strs[0].length();
        int l=1;
        while(l<n){
            min=(int)Math.min(min,strs[l].length());
            l++;
        }

        for(int i=0;i<min;i++){
            int count=n-1;
            for(int j=0;j<n-1;j++){
                if(strs[j].charAt(i)==strs[j+1].charAt(i)){
                    count--;
                }

            }
            if(count==0){
                s+=strs[0].charAt(i);
            }
            else{
                break;
            }
        }
        return s;
        
    }
}