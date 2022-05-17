class Solution {
    public int searchInsert(int[] nums, int target) {
     if(nums==null) 
         return 0;
if(target <= nums[0]) return 0;
for(int i=0; i<nums.length-1; i++){
if(target > nums[i] && target <= nums[i+1]){
return i+1;
}
}
return nums.length;
}
}
