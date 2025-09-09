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
    public void inOrder(TreeNode root, Stack<Integer> st){
        if(root==null) return;
        inOrder(root.left, st);
        st.push(root.val);
        inOrder(root.right, st);
    }
    public TreeNode increasingBST(TreeNode root) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> revSt = new Stack<>();
        inOrder(root,st);
        while(st.size()>0){
            revSt.push(st.pop());
        }
        TreeNode newRoot = new TreeNode(revSt.pop());
        TreeNode curr = newRoot;

        while (!revSt.isEmpty()) {
            curr.right = new TreeNode(revSt.pop());
            curr = curr.right;
        }
        return newRoot;
    }
}