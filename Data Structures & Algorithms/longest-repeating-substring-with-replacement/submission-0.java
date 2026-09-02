class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        Map<Character, Integer> lettersCount = new HashMap<>();
        int maxFreq = 0;
        int maxSeq = 0;

        for( int r = 0; r < s.length(); ++r){
            char current = s.charAt(r);
            if(lettersCount.containsKey(current)){
                lettersCount.put(current, lettersCount.get(current)+1);
            }
            else{
                lettersCount.put(current, 1);
            }
            maxFreq = Math.max(maxFreq, lettersCount.get(current));

            while (r-l +1 - maxFreq > k){
                lettersCount.put(s.charAt(l), lettersCount.get(s.charAt(l)) - 1);
                l += 1;
            }
            maxSeq = Math.max(maxSeq, r-l +1);
            
        }

        return maxSeq;
    }
}
