class Solution {
    public int countSegments(String s) {
        if(s.equals("")){
            return 0;
        }
        int count=0;
        String c[]=s.split("\\s");
        for(int i=0;i<c.length;i++){
            if(c[i].equals("")){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
        
    }
}