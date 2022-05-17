class Solution {
public int findMin(int[] nums) {
return findMin(nums, 0, nums.length - 1);
}
public int findMin(int[] nums, int left, int right) {
if (left == right)
return nums[left];
if ((right - left) == 1)
return Math.min(nums[left], nums[right]);
int middle = left + (right - left) / 2;
if (nums[left] < nums[right]) {
return nums[left];
// go right side
} else if (nums[middle] > nums[left]) {
return findMin(nums, middle, right);
// go left side
} else {
return findMin(nums, left, middle);
}
}
}