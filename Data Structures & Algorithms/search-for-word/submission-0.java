class Solution {
    public boolean exist(char[][] board, String word) {
        // 1. Buscamos en todo el tablero la PRIMERA letra
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // Si encontramos la primera letra, lanzamos a nuestro explorador (DFS)
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 0)) {
                        return true; // ¡La encontramos!
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        // CASO BASE 1: Éxito. Hemos encontrado todas las letras
        if (index == word.length()) return true;

        // CASO BASE 2: Fuera de límites (Out of bounds) o letra incorrecta
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        // --- BACKTRACKING ---
        
        // 1. ELEGIR: Marcamos la celda como visitada (Truco: usamos un carácter especial)
        char temp = board[i][j];
        board[i][j] = '#'; 

        // 2. EXPLORAR: En matrices NO hay bucles for. Simplemente miramos en las 4 direcciones.
        // Si ALGUNO de los caminos devuelve true, ganamos.
        boolean found = dfs(board, word, i + 1, j, index + 1) || // Abajo
                        dfs(board, word, i - 1, j, index + 1) || // Arriba
                        dfs(board, word, i, j + 1, index + 1) || // Derecha
                        dfs(board, word, i, j - 1, index + 1);   // Izquierda

        // 3. DESHACER (Backtrack): Devolvemos a la celda su letra original 
        // para que otros caminos puedan usarla si este falló.
        board[i][j] = temp;

        return found;
    }
}
