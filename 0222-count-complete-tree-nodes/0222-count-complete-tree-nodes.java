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
    public void count(TreeNode root,List<Integer> n){
        if(root==null) return;
        n.add(root.val);
        count(root.left,n);
        count(root.right,n);
    }
    public int countNodes(TreeNode root) {
    List<Integer> nodes = new ArrayList<>();
    count(root,nodes);
    int total = nodes.size();
    return total;
    }
}