class Solution {
    public int missingNumber(int[] nums) {
    int i = 0;
        while ( i < nums.length) {
          
            if (nums[i] == nums.length) {
                i ++;
                continue;
            }
            if (nums[i] != i) {
                int tmp = nums[i];
                nums[i] = nums[nums[i]];
                nums[tmp] = tmp;
            }   
            else {
                i ++;
            }
        }
        for (int j = 0; j < nums.length; j ++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }
}