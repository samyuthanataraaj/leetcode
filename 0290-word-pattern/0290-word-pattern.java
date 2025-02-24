class Solution {
    public boolean wordPattern(String pattern, String s) {
    
        String b[]=s.split(" ");
        int count=0;
        if(pattern.length()!=b.length){
            return false;
        }
        Map<Character,String> m1=new HashMap<>();
        Map<String,Character> m2=new HashMap<>();
        for(int i=0;i<b.length;i++){
            m1.putIfAbsent(pattern.charAt(i),b[i]);
            if(!m1.get(pattern.charAt(i)).equals(b[i])){
                return false;
            }
            m2.putIfAbsent(b[i],pattern.charAt(i));
            if(m2.get(b[i])!=pattern.charAt(i)){
                return false;
            }
        }
        return true;
    }
}