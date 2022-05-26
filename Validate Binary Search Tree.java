class Solution {
    public boolean isValidBST(TreeNode root) {
     return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static boolean validate(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val < min || root.val > max){
            return false;
        }
        return validate(root.left, min, (long)root.val - 1) && validate(root.right, (long)root.val + 1, max);
    }
} 