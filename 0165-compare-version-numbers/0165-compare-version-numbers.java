class Solution {
 public static int compareVersion(String version1, String version2) {
    String[] v1 = version1.split("\\.");
    String[] v2 = version2.split("\\.");

    int max= Math.max(v1.length, v2.length);
    for (int i = 0; i < max; i++) {
        int v3 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
        int v4 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

        if (v3 != v4) {
            return v3 > v4 ? 1 : -1;
        }
    }
    return 0; 
}

}