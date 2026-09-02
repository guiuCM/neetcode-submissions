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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        boolean current = (bigger(root.right, root.val) && lower(root.left, root.val));

        if(!current) return false;

        return (isValidBST(root.right) && isValidBST(root.left));
    }

    public boolean bigger( TreeNode root, int target){
        if(root == null) return true;
        if (root.val <= target) return false;

        return bigger(root.right, target) && bigger(root.left, target);
    }

    public boolean lower( TreeNode root, int target){
        if(root == null) return true;
        if((root.val >= target)) return false;

        return (lower(root.right, target) && lower(root.left, target));
    }

}
