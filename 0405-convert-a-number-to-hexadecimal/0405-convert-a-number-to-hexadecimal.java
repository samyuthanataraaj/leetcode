class Solution {
    public String toHex(int num) {
        
        long n = num & 0xFFFFFFFFL;

        
        if (n == 0) return "0";

        
        Map<Integer, Character> hexMap = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            hexMap.put(i, (char) ('0' + i));
        }
        hexMap.put(10, 'a');
        hexMap.put(11, 'b');
        hexMap.put(12, 'c');
        hexMap.put(13, 'd');
        hexMap.put(14, 'e');
        hexMap.put(15, 'f');

       
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int r = (int)(n % 16);
            sb.append(hexMap.get(r)); 
            n /= 16;
        }

       
        return sb.reverse().toString();
    }
}
