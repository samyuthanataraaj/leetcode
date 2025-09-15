class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        char arr[]=brokenLetters.toCharArray();
        String t[]=text.split("\\s+");
        
        int count=t.length;
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=k;j<t.length;j++){
               if(t[j].contains(String.valueOf(arr[i]))){
                t[j]=" ";
                count--;
               }
            }
        }
        return count;
        
    }
}