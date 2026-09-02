class Solution {
    public boolean isAnagram(String s, String t) {

        int[] primer = new int[26];

        for(char c : s.toCharArray()){
            int idx = (int) c - 'a';
            primer[idx] = primer[idx] + 1;
        }

        for(char c : t.toCharArray()){
            int idx = (int) c - 'a';
            primer[idx] = primer[idx] - 1;
        }

        for(int i = 0; i < primer.length; ++i){
            if(primer[i] != 0) return false;
        }
        return true;
    }
}