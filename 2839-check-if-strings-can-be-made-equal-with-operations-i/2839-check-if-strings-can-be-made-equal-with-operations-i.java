class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        char[] a = s1.toCharArray();

        // swap (0, 2)
        swap(a, 0, 2);
        if (new String(a).equals(s2)) return true;

        // swap (1, 3)
        swap(a, 1, 3);
        if (new String(a).equals(s2)) return true;

        // swap (0, 2) again -> both swaps applied
        swap(a, 0, 2);
        if (new String(a).equals(s2)) return true;

        return false;
    }

    private void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}