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
    private void check(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null) return;
        else if(t1==null || t2==null) {
            ans=false;
            return;
        } else {
            if(t1.val != t2.val){
                ans = false;
                return;
            }
            check(t1.left, t2.left);
            check(t1.right, t2.right);
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        check(p, q);
        return ans;
    }
}
