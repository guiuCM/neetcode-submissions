class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] count = new int[26];

        for(int i = 0; i < s.length(); ++i){
            int idx1 = (int) s.charAt(i) - 'a';
            int idx2 = (int) t.charAt(i) - 'a';
            count[idx1] = count[idx1] + 1;
            count[idx2] = count[idx2] - 1;
        }

        for(int i = 0; i < count.length; ++i){
            if(count[i] != 0) return false;
        }
        return true;
    }
}