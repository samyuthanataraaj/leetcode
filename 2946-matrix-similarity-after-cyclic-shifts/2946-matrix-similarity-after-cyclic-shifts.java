class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] mat1=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat1[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<1;j++){
                if(i%2==0){
                    int y=0;
                    while(y<k){
                    int temp=mat1[i][0];
                    for(int k2=0;k2<m-1;k2++){
                       mat1[i][k2]=mat1[i][k2+1];
                    }
                    mat1[i][m-1]=temp;
                    y++;
                    }
                }
                else{
                    int y1=0;
                    while(y1<k){
                    int temp1=mat1[i][m-1];
                    for(int k1=m-1;k1>0;k1--){
                        mat1[i][k1]=mat1[i][k1-1];
                    }
                    mat1[i][0]=temp1;
                    y1++;
                    }

                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(mat1[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat1[i][j]!=mat[i][j]){
                    return false;
                }
            }
         
        }
        return true;
        
        
    }
}