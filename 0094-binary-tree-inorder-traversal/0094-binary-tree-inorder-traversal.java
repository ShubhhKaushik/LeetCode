/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inOrder(TreeNode root, List<Integer> display){
        if(root==null) return;
        inOrder(root.left, display);
        display.add(root.val);
        inOrder(root.right, display);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> display = new ArrayList<>();
        inOrder(root, display);
        return display;
    }
}