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
    private int contador = 0;
    private int resultado = -1;

    public int kthSmallest(TreeNode root, int k) {
        // Iniciamos el viaje recursivo
        recorrerInOrder(root, k);
        return resultado;
    }

    private void recorrerInOrder(TreeNode nodo, int k) {
        // Caso Base: Si el nodo es nulo o ya encontramos el resultado, paramos
        if (nodo == null || contador >= k) {
            return;
        }

        // 1. IZQUIERDA: Vamos hasta el fondo (a por los más pequeños)
        recorrerInOrder(nodo.left, k);

        // 2. RAÍZ: Procesamos el nodo en el que estamos de vuelta
        contador += 1;
        if (contador == k) {
            resultado = nodo.val;
            return; // ¡Lo encontramos! No hace falta buscar más
        }

        // 3. DERECHA: Ahora vamos a por los números un poco más grandes
        recorrerInOrder(nodo.right, k);
    }
}
