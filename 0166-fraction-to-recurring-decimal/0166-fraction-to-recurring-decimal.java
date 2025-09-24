class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        // Fix for overflow when numerator = Integer.MIN_VALUE and denominator = -1
        if ((long) numerator % denominator == 0) {
            return Long.toString((long) numerator / denominator);
        }

        StringBuilder result = new StringBuilder();

        // Handle sign
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Convert to long to avoid overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Integer part
        result.append(num / den).append(".");
        num %= den;

        // Fractional part with remainder tracking
        Map<Long, Integer> remainderMap = new HashMap<>();
        StringBuilder fraction = new StringBuilder();

        while (num != 0) {
            if (remainderMap.containsKey(num)) {
                int index = remainderMap.get(num);
                fraction.insert(index, "(");
                fraction.append(")");
                break;
            }
            remainderMap.put(num, fraction.length());
            num *= 10;
            fraction.append(num / den);
            num %= den;
        }

        result.append(fraction);
        return result.toString();
    }
}
