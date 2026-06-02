class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        int count=0;
        HashSet<Character> t=new HashSet<>();
        for(int i=0;i<n;i++){
            t.add(word.charAt(i));
        }
        Character[] arr = t.toArray(new Character[0]);
        int n1=arr.length;
        for(int i=0;i<n1;i++){
            for(int j=i+1;j<n1;j++){
               
               int c1=(int)arr[i];
               int c2=(int)arr[j];
               boolean c=check(c1,c2);
               if(c){
                if((int)Math.abs(c1-c2)==32){
                    count++;
                }
               }
        }
        }
        return count;
    }
    
    public boolean check(int c1,int c2){
        if(c1>=65&&c1<=90){
            if(c2>=97&&c2<=122){
                return true;
            }
        }
        else if(c2>=65&&c2<=90){
            if(c1>=97&&c1<=122){
                return true;
            }
        }
        return false;

    }
}