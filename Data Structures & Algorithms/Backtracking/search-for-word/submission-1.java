class Solution {
    public boolean exist(char[][] board, String word) {

        //primer busquem la primera lletra
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        
        //base case
        if (index == word.length()) return true;

        //base case (per podar ràpid camins inútils)
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        //Marcar com a visitat (podem fer-ho amb un matriu de bools visited[row][col])
        char temp = board[i][j];
        board[i][j] = '#'; //board[i][j] != word.charAt(index)) ha de fallar

        //Mirar les 4 direccions
        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1);

        //Eliminar el camí pel següent backtracking
        board[i][j] = temp;

        return found;
    }
}
