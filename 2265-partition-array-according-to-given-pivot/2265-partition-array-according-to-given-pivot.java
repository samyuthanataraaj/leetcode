class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
        List<Integer> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<pivot){
                l.add(arr[i]);
            }
            else if(arr[i]==pivot){
                l1.add(arr[i]);
            }
            else{
                l2.add(arr[i]);
            }
        }
        
        int arr1[]=new int[arr.length];
        l.addAll(l1);
        l.addAll(l2);
        for(int i=0;i<arr.length;i++){
            arr1[i]=l.get(i);
        }
        return arr1;
        
    }
}