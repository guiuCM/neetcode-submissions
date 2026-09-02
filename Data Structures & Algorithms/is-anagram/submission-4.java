class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        Map <Character, Integer> count = new HashMap<>();

        for(int i = 0; i < s.length(); ++i){
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); ++i){
            if(count.containsKey(t.charAt(i))){
                if(count.get(t.charAt(i)) > 0){
                    count.put(t.charAt(i), count.get(t.charAt(i)) - 1);
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }

        return true;
    }
}
