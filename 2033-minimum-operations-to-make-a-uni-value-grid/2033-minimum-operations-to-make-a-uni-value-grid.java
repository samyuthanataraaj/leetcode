class Solution {
    public int minOperations(int[][] grid, int x) {
    List<Integer> values = new ArrayList<>();
    for (int[] row : grid) {
        for (int val : row) {
            values.add(val);
        }
    }
    
    int remainder = values.get(0) % x;
    for (int val : values) {
        if (val % x != remainder) {
            return -1;  
        }
    }
    
    
    Collections.sort(values);
    System.out.println(values);
    int median = values.get(values.size() / 2);
 
    int operations = 0;
    for (int val : values) {
        operations += Math.abs(val - median) / x;
    }
    
    return operations;
}
    
}