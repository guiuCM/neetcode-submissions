class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        Set<Character> seen = new HashSet<>();
        int i = 0;
        int max = 0;

        for (int j = 0; j < s.length(); j++) {
            //Eliminem de un a un fins que sigui diferent
            while (seen.contains(s.charAt(j))) {
                seen.remove(s.charAt(i));
                i++;
            }
            
            // Afegim el caràcter actual i calculem la mida de la finestra (j - i + 1)
            seen.add(s.charAt(j));
            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}