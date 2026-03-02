class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l =new ArrayList<>();

        for(int i=left;i<=right;i++){
            String s=""+i;
            int num=i;
            int k=0;
            while(num>0){
                
                int r=num%10;
                if(r!=0&&i%r==0){
                   k++; 
                }
                
                num/=10;
            }
           
            if(k==s.length()){
                l.add(i);
            }
            
        }
        return l;
        
    }
}