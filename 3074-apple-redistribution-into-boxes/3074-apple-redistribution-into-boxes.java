class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int cap=0;
        int count=0;
        for(int i=0;i<apple.length;i++){
           cap+=apple[i];
        }
        int sum=0;
        for(int i=capacity.length-1;i>=0;i--){
            sum+=capacity[i];
            count++;
            if(sum>=cap){
                return count;
            }
        }
        return -1;
        

    }
}