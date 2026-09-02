class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Caso 1: Palíndromo impar (ej: "aba")
            int len1 = expandAroundCenter(s, i, i);
            // Caso 2: Palíndromo par (ej: "abba")
            int len2 = expandAroundCenter(s, i, i + 1);
            
            int len = Math.max(len1, len2);
            
            // Si encontramos uno más largo, actualizamos los índices
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        // substring en Java: el final es exclusivo, por eso end + 1
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Retorna la longitud del palíndromo encontrado
        return right - left - 1;
    }
}