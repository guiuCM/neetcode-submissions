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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null) return root;


        while (root != null){
            if(p.val >= root.val && root.val >= q.val || q.val >= root.val && root.val >= p.val) return root;

            else if(p.val > root.val){
                root = root.right;
            }
            else{//p.val < root.val
                root = root.left;
            }
        }
        return root;

    }
}


// public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
//         // Mientras no lleguemos al fondo del árbol
//         while (root != null) {
            
//             // Caso 1: Ambos nodos son MAYORES. El LCA está a la derecha.
//             if (p.val > root.val && q.val > root.val) {
//                 root = root.right;
//             }
//             // Caso 2: Ambos nodos son MENORES. El LCA está a la izquierda.
//             else if (p.val < root.val && q.val < root.val) {
//                 root = root.left;
//             }
//             // Caso 3: Hemos encontrado la "bifurcación" (o uno es igual a la raíz).
//             // ¡Este es nuestro LCA!
//             else {
//                 return root;
//             }
//         }
        
//         return null;
//     }
