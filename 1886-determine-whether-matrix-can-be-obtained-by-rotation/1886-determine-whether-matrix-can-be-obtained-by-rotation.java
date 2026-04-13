class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(mat.length!=target.length){
            return false;
        }
        int n=mat.length;
        int[][]mat1=new int[n][mat[0].length];
      
        mat1=rotate(mat);
        for(int i=0;i<n+n;i++){
           boolean j=istrue(mat1,target);
           if(j!=true){
           mat1=rotate(mat1);
           }
           else{
            return j;
           }
        
        }
        return false;
        
    }
    public int[][] rotate(int[][] mat){
        int n=mat.length;
        int[][]mat1=new int[n][mat[0].length];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat1[j][n-1-i]=mat[i][j];
                
            }
        }
        return mat1;
    }
    public boolean istrue(int[][] mat1,int[][] target){
        int n=mat1.length;
      
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat1[i][j]!=target[i][j]){
                   return false;
                }
            }
        }
        return true;

    }
}