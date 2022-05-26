class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
     Queue<TreeNode> qv = new LinkedList<TreeNode>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (root == null) {
            return result;
        }
        qv.add(root);
        while (qv.size() > 0) {
            int n = qv.size();
            List<Integer> add = new LinkedList<Integer>();
            for (int i = 0; i < n; i ++) {
                TreeNode node = qv.remove();
                add.add(node.val);
                if (node.left !=null) {
                    qv.add(node.left);
                }
                if (node.right !=null) {
                    qv.add(node.right);
                }
            }
            result.add(add);
        }
        return result;
    }
}