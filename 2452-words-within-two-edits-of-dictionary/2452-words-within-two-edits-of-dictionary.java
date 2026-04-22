class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> l=new ArrayList<>();
        int n=queries.length;
        int m=dictionary.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int inequal=0;
                char c1[]=queries[i].toCharArray();
                char c2[]=dictionary[j].toCharArray();
                for(int k=0;k<c1.length;k++){
                     if(c1[k]!=c2[k]){
                        inequal++;
                     }
                }
                if(inequal<=2){
                   l.add(queries[i]);
                   break;
                }
            }
        }
        return l;
    }
}