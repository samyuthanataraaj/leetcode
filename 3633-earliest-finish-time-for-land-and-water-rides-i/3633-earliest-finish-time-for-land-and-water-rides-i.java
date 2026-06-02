class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;
       
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            int time=landStartTime[i]+landDuration[i];
            while(time<waterStartTime[j]){
                time++;
            }
            if(time>=waterStartTime[j]){
                time+=waterDuration[j];
            }

            if(min>time){
                min=time;
            }
           
            }

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            int time1=waterStartTime[i]+waterDuration[i];
            while(time1<landStartTime[j]){
                time1++;
            }
            if(time1>=landStartTime[j]){
                time1+=landDuration[j];
            }
           
            if(min>time1){
                min=time1;
            }
            }

        }
        return min;

    }
}