class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
 List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        process(result, new LinkedList<Integer>(), 0, nums);
        return result;
    }
    private void process(List<List<Integer>> result, List<Integer> curr, int start, int[] nums) {
        result.add(new LinkedList<Integer>(curr));
        for (int i = start; i < nums.length; i ++) {
            if (i == start || nums[i] != nums[i-1]){
                curr.add(nums[i]);
                process(result, curr, i + 1, nums);
                curr.remove(curr.size() - 1);
            }
        }
    }
}