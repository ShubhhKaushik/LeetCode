class Solution {
    public void nthLevel(TreeNode root, int n, List<Integer> ans){
        if (root == null) return;
        if (n == 1) {
            ans.add(root.val);
        }
        nthLevel(root.left, n - 1, ans);
        nthLevel(root.right, n - 1, ans);
    }
    public void nthLevel1(TreeNode root, int n, List<Integer> ans){
        if (root == null) return;
        if (n == 1) {
            ans.add(root.val);
        }
        nthLevel1(root.right, n - 1, ans);
        nthLevel1(root.left, n - 1, ans);
    }
    public int height(TreeNode root){
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        int level = height(root);
        for (int i = 1; i <= level; i++) {
            List<Integer> ans = new ArrayList<>();
            if (i % 2 == 0)
                nthLevel1(root, i, ans);
            else 
                nthLevel(root, i, ans);
            res.add(ans);
        }
        return res;
    }
}
