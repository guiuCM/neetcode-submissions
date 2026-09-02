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
        // Iniciamos la recursión con límites infinitos
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        // Caso Base 1: Llegamos al final de una rama sin romper reglas
        if (node == null) return true;

        // Caso Base 2: El nodo rompe el rango permitido
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // El Salto de Fe: Validamos hijos actualizando los límites
        // Hacia la izquierda: el maximo pasa a ser mi valor actual
        // Hacia la derecha: el minimo pasa a ser mi valor actual
        return validate(node.left, min, node.val) && 
               validate(node.right, node.val, max);
    }

}
