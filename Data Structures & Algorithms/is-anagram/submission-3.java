class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        // Creamos una tabla de frecuencias para las 26 letras del alfabeto
        int[] counter = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // 'a' - 'a' = 0, 'b' - 'a' = 1, etc.
            counter[s.charAt(i) - 'a']+= 1;
            counter[t.charAt(i) - 'a']-= 1;
        }

        // Si es un anagrama, todas las posiciones deben ser 0
        for (int i = 0; i < counter.length; ++i) {
            if (counter[i] != 0) return false;
        }

        return true;
    
    }
}
