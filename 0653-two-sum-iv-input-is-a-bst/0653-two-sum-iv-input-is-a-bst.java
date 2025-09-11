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
    public void inOrder(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return;
        inOrder(root.left,ans);
        ans.add(root.val);
        inOrder(root.right,ans);
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        inOrder(root,ans);
        int n = ans.size();
        int i = 0,j = n-1;
        while(i<j){
            int sum = ans.get(i) + ans.get(j);
            if(sum == k) return true;
            else if(sum<k) i++;
            else j--;
        }
        return false;
    }
}