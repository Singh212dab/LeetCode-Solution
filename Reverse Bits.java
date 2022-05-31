public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int m = 1;
        for (int i = 0; i < 32; i ++) {
            int digit = n & m;
            result = (result << 1);
            if (digit != 0) {
                 result = result + 1;
            }
            m = (m << 1);
        }
        return result;
    }
} 
