class Solution {
    public boolean isPalindrome(String s) {
        List<Character> l=new ArrayList<>();
        List<Character> l1=new ArrayList<>();
        String s1=s.toLowerCase();
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)>='a'&&s.charAt(i)<='z'||s1.charAt(i)>='0'&&s1.charAt(i)<='9'){
                l.add(s1.charAt(i));
            }
        }
        for(int j=n-1;j>=0;j--){
            if(s1.charAt(j)>='a'&&s.charAt(j)<='z'||s1.charAt(j)>='0'&&s1.charAt(j)<='9'){
                l1.add(s1.charAt(j));
            }
        }
        System.out.println(l);
        System.out.println(l1);
        return l.equals(l1);
        
    }
}