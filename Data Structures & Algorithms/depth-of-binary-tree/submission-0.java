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
    public int maxDepth(TreeNode root) {
        // Caso base: si llegamos al final, la profundidad es 0
        if (root == null) {
            return 0;
        }

        // 1. Calculamos la profundidad de cada subárbol
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // 2. Retornamos el mayor de los dos + 1 (por el nodo actual)
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
