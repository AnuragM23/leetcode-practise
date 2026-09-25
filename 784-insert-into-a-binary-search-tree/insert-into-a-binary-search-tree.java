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
    private void helper(TreeNode node, int val) {
        if(node.val > val){
            if(node.left==null) {
                TreeNode newNode = new TreeNode(val);
                node.left = newNode;
                return;
            }
            helper(node.left, val);
        } else {
            if(node.right==null) {
                TreeNode newNode = new TreeNode(val);
                node.right = newNode;
                return;
            }
            helper(node.right, val);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        helper(root,val);
        return root;
    }
}