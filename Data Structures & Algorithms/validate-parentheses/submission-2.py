class Solution:
    def isValid(self, s: str) -> bool:
        
        stack = []

        for p in s:
            
            if p == "(" or p == "[" or p == "{":
                stack.append(p)
            
            elif p == ")" :
                if not stack : #isEmpty
                    return False
                if stack[-1] != "(":
                    return False
                stack.pop()
            
            elif p == "]" :
                if not stack : #isEmpty
                    return False
                if stack[-1] != "[":
                    return False
                stack.pop()
            
            elif p == "}" :
                if not stack : #isEmpty
                    return False
                if stack[-1] != "{":
                    return False
                stack.pop()


        if not stack : #isEmpty
            return True

        return False