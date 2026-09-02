class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. Si no tenen la mateixa longitud, és impossible
        if (s.length() != t.length()) {
            return false;
        }

        // 2. Un array de 26 posicions (inicialment tot zeros)
        int[] count = new int[26];

        // 3. Com que tenen la mateixa mida, podem fer un sol bucle!
        // Sumem 1 per a les lletres de 's' i restem 1 per a les lletres de 't'
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // Sumem la lletra de la paraula 1
            count[t.charAt(i) - 'a']--; // Restem la lletra de la paraula 2
        }

        // 4. Si realment són anagrames, les sumes i restes s'hauran anul·lat 
        // i tot l'array hauria de ser zero.
        for (int freq : count) {
            if (freq != 0) {
                return false; // Hi ha un desajust
            }
        }

        return true;
    }
}