class Solution {
    public int minimumSum(int num) {
        String s=String.valueOf(num);
        int arr[]=new int[s.length()];
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i)-'0';
        }
        Arrays.sort(arr);
        int min=Integer.valueOf(Integer.toString(arr[0])+Integer.toString(arr[n-1]));
        int smin=Integer.parseInt(Integer.toString(arr[1])+Integer.toString(arr[n-2]));
        return min+smin;


        
        
    }
}