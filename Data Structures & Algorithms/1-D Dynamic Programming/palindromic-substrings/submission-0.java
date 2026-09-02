class Solution {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int totalCount = 0;

        for (int i = 0; i < s.length(); i++) {
            //IMPAR
            totalCount += countPalindromesAroundCenter(s, i, i);
            
            //PAR
            totalCount += countPalindromesAroundCenter(s, i, i + 1);
        }

        return totalCount;
    }

    // Esta función hace el trabajo sucio: se expande mientras los extremos sean iguales
    private int countPalindromesAroundCenter(String s, int left, int right) {
        int count = 0;
        
        // Mientras estemos dentro de los límites y los caracteres coincidan...
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;    // ¡Hemos encontrado un palíndromo!
            left--;     // Nos expandimos hacia la izquierda
            right++;    // Nos expandimos hacia la derecha
        }
        
        return count;
    }
}