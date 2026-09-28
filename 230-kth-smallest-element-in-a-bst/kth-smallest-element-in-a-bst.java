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
    public int kthSmallest(TreeNode root, int k) {
        
        List<Integer> arr = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null || k<1) return -1;
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            arr.add(node.val);
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
        
        arr.sort(null);
        return arr.get(k-1);
    }
}
