class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int flag=-1;
        for(int i=0;i<words.length;i++){
            if(target.equals(words[i])){
                flag=1;
                break;
            }
        }
        if(flag==-1){
            return flag;
        }
        List<String> left=new ArrayList<>();
        List<String> right=new ArrayList<>();
        int k1=words.length;
        int k2=startIndex;
       
        for (int i = k2, count = 0; count < words.length; i++, count++) {
            right.add(words[i]);
            if (i == words.length - 1) {
                i = -1;
            }
        }

        int k4=startIndex;
        int k5=0;
        
        for (int i = k4, count = 0; count < words.length; i--, count++) {
            left.add(words[i]);
            if (i == 0) {
                i = words.length;
            }
        }

        System.out.println(left);
        System.out.println(right);
        int dist=Integer.MAX_VALUE;
        for(int i=0;i<left.size();i++){
            if(target.equals(left.get(i))){
                if(dist>i){
                    dist=i;
                }
            }
        }
        for(int i=0;i<right.size();i++){
            if(target.equals(right.get(i))){
                if(dist>i){
                    dist=i;
                }
            }
        }
        return dist;
        
    }
}