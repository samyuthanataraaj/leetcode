class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int arr[]=new int[n];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
          int f=nums1.length;
        for(int i=0;i<nums2.length;i++){
  
            arr[f]=nums2[i];
            f++;
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        double k;
        if(n%2==0){

             k=(double)((arr[n/2]+arr[(n/2)-1])/2.0);

        }
        else{
            k=(double)(arr[(n/2)]);
        }
        return k;
        
    }
}