class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        new = ""
        inverse = ""

        for c in s :
            if c.isalnum():
                new += c.lower()

        for c in new:
            inverse = c + inverse

        return new == inverse