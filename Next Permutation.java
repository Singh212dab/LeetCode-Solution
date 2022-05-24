class Solution {
    public void nextPermutation(int[] nums) {
    int pNumIndex = -1;
        for (int i = nums.length - 1; i >0; i --){
            if (nums[i-1] < nums[i]){ 
                pNumIndex = i-1; 
                break; 
            } 
        } 
        if (pNumIndex != -1){ 
            int NumIndex = -1;
            for (int i = nums.length - 1; i > pNumIndex; i --){
                if (nums[i] > nums[pNumIndex]){
                    NumIndex = i;
                    break;
                }
            }
            int tmp = nums[pNumIndex];
            nums[pNumIndex] = nums[NumIndex];
            nums[NumIndex] = tmp;
        }
        int start = pNumIndex + 1, end = nums.length -1;
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start ++;
            end --;
        }    
    }
}