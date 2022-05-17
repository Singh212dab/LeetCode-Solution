class Solution {
    public int strStr(String haystack, String needle) {
    if (haystack == null || needle == null) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        /* length of the needle */
        int needleLength = needle.length();
        // Looping
        for (int i = 0; i < haystack.length() - needleLength + 1; i++) {
            // Check if the substring equals to the needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}