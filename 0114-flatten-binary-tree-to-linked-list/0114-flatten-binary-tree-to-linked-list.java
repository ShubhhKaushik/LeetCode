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
    public void preOrder(TreeNode root,Stack<TreeNode> st){
        if(root==null) return;
        st.push(root);
        preOrder(root.left,st);
        preOrder(root.right,st);
    }
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode> st = new Stack<>();
        Stack<TreeNode> revSt = new Stack<>();
        preOrder(root,st);
        while(st.size()>0){
            revSt.push(st.pop());
        }

        TreeNode head = revSt.pop();
        TreeNode temp = head;
        while(revSt.size()>0){
            TreeNode node = revSt.pop();
            temp.left = null;
            temp.right = node;
            temp = node;
        }
    }
}