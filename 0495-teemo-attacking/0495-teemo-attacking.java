class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // HashSet<Integer> s=new HashSet<>();
        // int n=timeSeries.length;
        // int i=0;
        // while(i<n){
        //     int k=timeSeries[i];
        //     int j=0;
        //     while(j<duration){
        //         s.add(k);
        //         k++;
        //         j++;
        //     }
        //     i++;
        // }
        // System.out.println(s);
        // return s.size();
        
if (timeSeries.length == 0) return 0;

    int total = 0;

    for (int i = 0; i < timeSeries.length - 1; i++) {
        int gap = timeSeries[i + 1] - timeSeries[i];
        total += Math.min(gap, duration);
    }

   
    total += duration;

    return total;

    }
}