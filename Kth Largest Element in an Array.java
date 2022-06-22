class Solution {
    public int findKthLargest(int[] nums, int k) {
     return quickSelect(nums, 0, nums.length - 1, k);
    }
    private int quickSelect(int[] nums, int start, int end, int k) {
        int index = partition(nums, start, end, k);
        int right = end - index + 1;
        if (right == k) {
            return nums[index];
        }
        if (right > k) {
            return quickSelect(nums, index + 1, end, k);
        }
        else {
            return quickSelect(nums, start, index - 1, k - right);
        }
    }
    private int partition(int[] nums, int start, int end, int k) {
        int pivot = nums[end];
        int index = end - 1;
        while (start <= index) {
            if (nums[start] > pivot) {
                while (index > start && nums[index] > pivot) {
                    index --;
                }
                int tmp = nums[start];
                nums[start] = nums[index];
                nums[index] = tmp;
                index --;
            }
            start ++;
        }
        nums[end] = nums[index + 1];
        nums[index + 1] = pivot;
        return index + 1;
    }

}
