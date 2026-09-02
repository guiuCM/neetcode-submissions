class Solution {
    public int uniquePaths(int m, int n) {
        int[][] matriu = new int[m][n];
        /*for (int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j) {
                matriu[i][j] = 1;  //Omplim la matriu a 1 per començar el bucle a m[1][1]
            }
        }*/

        for (int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){

                // Cas base: Per a la primera fila o la primera columna,
                // només hi ha 1 manera d'arribar-hi (tot recte).
                if (i == 0 || j == 0) {
                    matriu[i][j] = 1;
                }
                else {
                    // El total de camins és la SUMA dels camins des de dalt i l'esquerra
                    matriu[i][j] = matriu[i - 1][j] + matriu[i][j - 1];
                }
            }
        }
        return matriu[m-1][n-1];
    }
}
