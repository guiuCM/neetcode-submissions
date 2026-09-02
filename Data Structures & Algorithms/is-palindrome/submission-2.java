class Solution {
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        s = s.toLowerCase();

        while (l <= r){
            //passar espais
            while(l < r && !Character.isLetterOrDigit(s.charAt(l))){
                l += 1;
            }
            while(r > l && !Character.isLetterOrDigit(s.charAt(r))){
                r -= 1;
            }

            //no coincideixen
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }

            l+=1;
            r-=1;

        }
        return true;
        
    }
}
