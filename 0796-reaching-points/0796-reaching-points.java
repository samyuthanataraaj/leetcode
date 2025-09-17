class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            if (tx == sx && ty == sy) {
                return true;
            }

            if (tx > ty) {
                if (ty > sy) {
                    tx %= ty;
                } else {
                    // When ty == sy, we can only subtract multiples of sy
                    return (tx - sx) % sy == 0;
                }
            } else {
                if (tx > sx) {
                    ty %= tx;
                } else {
                    // When tx == sx, we can only subtract multiples of sx
                    return (ty - sy) % sx == 0;
                }
            }
        }
        return false;
    }
}
