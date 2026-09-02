class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> contValues = new HashMap<>();
        if (s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            if (contValues.containsKey(c)){
                contValues.put(c, contValues.get(c)+1);
            }
            else{
                contValues.put(c,1);
            }
        }

        for(int i = 0; i < t.length(); ++i){
            char c = t.charAt(i);
            if (contValues.containsKey(c)){
                contValues.put(c, contValues.get(c)-1);
            }
        }

        for(Map.Entry<Character, Integer> entrada : contValues.entrySet()){
            if (entrada.getValue() != 0) return false;
        }
        return true;

    }
}
