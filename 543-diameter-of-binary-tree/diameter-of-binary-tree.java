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
    private int ans = 0;

    private int maxHeight(TreeNode node) {
        if(node == null) return 0;
        int left = maxHeight(node.left);
        int right = maxHeight(node.right);
        ans = Math.max(ans, left+right);
        return 1 + Math.max(left, right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        System.gc();
        int max = maxHeight(root);
        return ans;
    }
}
