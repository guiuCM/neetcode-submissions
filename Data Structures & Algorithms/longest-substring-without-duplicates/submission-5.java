class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0; // The start of our current window

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            if (map.containsKey(currentChar)) {
                // Move 'left' to the right of the previous duplicate
                // But only move it forward (don't jump back!)
                left = Math.max(left, map.get(currentChar) + 1);
            }
            
            map.put(currentChar, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
