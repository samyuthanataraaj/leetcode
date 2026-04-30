class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        List<Integer> l=Arrays.stream(capacity).boxed().collect(Collectors.toList());
        Collections.sort(l,Collections.reverseOrder());
        int cap=0;
        int count=0;
        for(int i=0;i<apple.length;i++){
           cap+=apple[i];
        }
        int sum=0;
        for(int i=0;i<l.size();i++){
            sum+=l.get(i);
            count++;
            if(sum>=cap){
                return count;
            }
        }
        return -1;
        

    }
}