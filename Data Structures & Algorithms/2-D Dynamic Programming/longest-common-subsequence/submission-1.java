class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1 == null || text2 == null){
            return 0;
        }

        int m = text1.length();
        int n = text2.length();
        int[][] matriu = new int[m + 1][n + 1]; //evitar index negatius

        for (int i = 1; i < m + 1; ++i){
            for (int j = 1; j < n + 1; ++j){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    matriu[i][j] = 1 + matriu[i - 1][j - 1];
                }
                else {
                    matriu[i][j] = Math.max(matriu[i - 1][j], matriu[i][j - 1]);
                }
            }
        }

        return matriu[m][n];
    }
}
