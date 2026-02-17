class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int size=0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(g[i]<=s[j]){
                    s[j]=-1;
                    System.out.println(s[j]);
                    size++;
                    break;
                    
                }
            }
        }
        return size;
        
    }
}