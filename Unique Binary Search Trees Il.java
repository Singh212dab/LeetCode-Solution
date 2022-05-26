class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<TreeNode>();
        }
        return gt(1, n);
    }
    private List<TreeNode> gt(int start, int end){
        List<TreeNode> res = new ArrayList<TreeNode>();
        if (start > end){
            res.add(null);
            return res;
        }
        for (int i = start; i <= end; i ++){
            List<TreeNode> lefts = gt(start, i - 1);
            List<TreeNode> rights = gt(i + 1, end);
            for (TreeNode left:lefts){
                for (TreeNode right:rights){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}