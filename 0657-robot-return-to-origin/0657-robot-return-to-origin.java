class Solution {
    public boolean judgeCircle(String moves) {
    int k=0;
    int kl=0;
    int kr=0;
    int ku=0;
    int kd=0;
    for(int i=0;i<moves.length();i++){
        if(moves.charAt(i)=='D'||moves.charAt(i)=='L'){
            k+=1;
        }
        else {
            k-=1;
        }
        if(moves.charAt(i)=='D'){
            kd++;
        }
        else if(moves.charAt(i)=='L'){
            kl++;
        }
        else if(moves.charAt(i)=='R'){
            kr++;
        }
        else if(moves.charAt(i)=='U'){
            ku++;
        }

    }
    if(k==0&&((kd==ku)||(kl==kr))){
        return true;
    }
    return false;
    

        
    }
}