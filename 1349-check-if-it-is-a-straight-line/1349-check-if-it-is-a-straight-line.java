class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int r=coordinates.length;
        int k=coordinates[1][0]-coordinates[0][0];
        int f=coordinates[1][1]-coordinates[0][1];
        
        for(int i=2;i<r;i++){
            int x1=coordinates[i][0];
            int x2=coordinates[i][1];
            if(((x1-coordinates[0][0])*f!=(x2-coordinates[0][1])*k)){
                return false;
            }
         
        }

        return true;
        
        
        
    }
}