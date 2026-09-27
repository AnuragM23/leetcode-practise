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
    private int counter=0;
    private void helper(TreeNode node, int compareData) {
        if(node == null) return;
        if(node.val >= compareData) {
            compareData = node.val;
            counter++;
        }
        helper(node.left, compareData);
        helper(node.right, compareData);
    }
    public int goodNodes(TreeNode root) {
        helper(root, Integer.MIN_VALUE);
        return counter;
    }
}
