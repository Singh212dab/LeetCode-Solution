class Solution {
    public boolean findTarget(TreeNode root, int k) {
     HashSet<Integer> appr = new HashSet<Integer>();
        return inorder(root, k, appr);
    }
    private boolean inorder(TreeNode node, int k, HashSet<Integer> appr) {
        if (node == null) {
            return false;
        }
        if (inorder(node.left, k, appr)) {
            return true;
        }
        if (appr.contains(k - node.val)) {
            return true;
        }
        appr.add(node.val);
        if (inorder(node.right, k, appr)) {
            return true;
        }
        return false;
    }
}   
  