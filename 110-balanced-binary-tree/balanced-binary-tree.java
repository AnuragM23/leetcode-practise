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
    private boolean ans = true;

    private int maxHeight(TreeNode node){
        if(node == null) return 0;
        int left = maxHeight(node.left);
        int right = maxHeight(node.right);
        if(Math.abs(left-right) > 1) ans=false;
        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        int maxi = maxHeight(root);
        return ans;
    }
}
