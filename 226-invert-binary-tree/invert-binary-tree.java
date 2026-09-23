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
    private void inverse(TreeNode node){
        if(node==null || (node.left==null && node.right==null)) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        
        inverse(node.left);
        inverse(node.right);
    }

    public TreeNode invertTree(TreeNode root) {
        inverse(root);
        return root;
    }
}
