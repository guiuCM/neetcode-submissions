class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }

        int l = 0;
        for (int r = 0; r < s2.length(); r++) {
            int rightIdx = s2.charAt(r) - 'a';
            count[rightIdx]--;

            // Si hem agafat més cops el caràcter del compte, encongim per l'esquerra
            while (count[rightIdx] < 0) {
                count[s2.charAt(l) - 'a']++;
                l++;
            }

            // Si la mida de la finestra és exactament la mida de s1, és una permutació
            if (r - l + 1 == s1.length()) {
                return true;
            }
        }

        return false;
    }
}