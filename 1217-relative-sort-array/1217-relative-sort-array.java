class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> l=new ArrayList<Integer>();
        List<Integer> l2=new ArrayList<Integer>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    l.add(arr1[j]);
                }
            }
            
        }
        System.out.println(l);
        for(int i=0;i<arr1.length;i++){
            if(!l.contains(arr1[i])){
                l2.add(arr1[i]);
                
            }
        }
        Collections.sort(l2);
        for(int i=0;i<l2.size();i++){
            l.add(l2.get(i));
        }

        
        int arr3[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr3[i]=l.get(i);
        }
        return arr3;
    }
}