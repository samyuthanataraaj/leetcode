class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String [] c=sentences[i].split("\\s");
            if(max<c.length){
                max=c.length;
            }
        }
        return max;
        
    }
}