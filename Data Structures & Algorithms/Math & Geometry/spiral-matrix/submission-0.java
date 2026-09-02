class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        // Prevención de errores si nos pasan una matriz vacía
        if (matrix == null || matrix.length == 0) return result;

        // 1. Inicializamos los muros correctamente
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            
            // 1. Caminar hacia la DERECHA
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // La fila superior ya está procesada, bajamos el muro

            // 2. Caminar hacia ABAJO
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // La columna derecha ya está procesada, acercamos el muro

            // FRENOS DE EMERGENCIA: ¿Se han cruzado los muros después de moverlos?
            // (Esto pasa en matrices rectangulares)
            if (top <= bottom) {
                // 3. Caminar hacia la IZQUIERDA (¡Marcha atrás!)
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // Subimos el muro inferior
            }

            if (left <= right) {
                // 4. Caminar hacia ARRIBA (¡Marcha atrás!)
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Acercamos el muro izquierdo
            }
        }

        return result;
    }
}